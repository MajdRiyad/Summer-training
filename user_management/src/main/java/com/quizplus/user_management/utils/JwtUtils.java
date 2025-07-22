package com.quizplus.user_management.utils;

import com.quizplus.user_management.model.UserDetailsImpl;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtils {

    private final SecretKey jwtSecret = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    private final int jwtExpireIn = 86400000 ;//24 h

    public String generateToken(Authentication authentication) {
        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

        Map<String, Object> claims = new HashMap<>();
        claims.put("role",userPrincipal.getRoleType().name());

        return Jwts.builder().setClaims(claims)
                .setSubject(userPrincipal.getUsername())
                .claim("roles", userPrincipal.getAuthorities())
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime()+jwtExpireIn)).signWith(SignatureAlgorithm.HS512, jwtSecret).compact();

    }
    public String getUserNameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }
    public String getRoleFromJwtToken(String token) {
        return Jwts.parserBuilder().setSigningKey(jwtSecret).build().parseClaimsJws(token).getBody().get("role", String.class);
    }
    public boolean validateJwtToken(String token) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        }catch (JwtException e){
            System.out.println("Invalid JWT token: " + e.getMessage());
        }
        return false;
    }
}
