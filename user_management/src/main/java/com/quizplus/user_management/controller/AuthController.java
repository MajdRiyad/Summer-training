package com.quizplus.user_management.controller;

import com.quizplus.user_management.controller.dto.AdminRegistrationRequest;
import com.quizplus.user_management.controller.dto.JwtResponse;
import com.quizplus.user_management.controller.dto.LoginRequest;
import com.quizplus.user_management.model.*;
import com.quizplus.user_management.service.*;
import com.quizplus.user_management.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import static com.quizplus.user_management.enums.RoleType.ROLE_ADMIN;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserService userService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private BranchService branchService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AdminRegistrationRequest adminRegistrationRequest) {
        Company company = new Company();
        company.setName(adminRegistrationRequest.getCompanyName());
        companyService.addCompany(company);

        Branch branch = new Branch();
        branch.setAddress(adminRegistrationRequest.getAddressBranch());
        branch.setCompany(company);
        branch.setMainBranch(true);
        branchService.addBranch(branch);

        Role role = new Role();
        role.setType(ROLE_ADMIN);
        role.setName("Adimn");
        role.setManager(true);
        roleService.addRole(role);


        Department department = new Department();
        department.setName(adminRegistrationRequest.getDepartmentName());
        department.setCompany(company);
        departmentService.addDepartment(department);

        Users adminUser = new Users();
        adminUser.setFirstName(adminRegistrationRequest.getFirstName());
        adminUser.setLastName(adminRegistrationRequest.getLastName());
        adminUser.setEmail(adminRegistrationRequest.getEmail());
        adminUser.setPassword(passwordEncoder.encode(adminRegistrationRequest.getPassword()));
        adminUser.setBranch(branch);
        adminUser.setDepartment(department);
        adminUser.setRole(role);
        userService.addUser(adminUser);


        return ResponseEntity.ok("Admin registered successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<?>authenticateUser(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequest.getEmail(), loginRequest.getPassword()
        ));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtils.generateToken(authentication);

        return ResponseEntity.ok(new JwtResponse(token));
    }
}
