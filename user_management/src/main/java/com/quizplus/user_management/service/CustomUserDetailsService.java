package com.quizplus.user_management.service;

import com.quizplus.user_management.model.UserDetailsImpl;
import com.quizplus.user_management.model.Users;
import com.quizplus.user_management.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       //Fetch the user from the database by email
        Users user =  usersRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new UserDetailsImpl(user.getId(), user.getEmail(), user.getPassword(), user.getRole().getType());
    }
}
