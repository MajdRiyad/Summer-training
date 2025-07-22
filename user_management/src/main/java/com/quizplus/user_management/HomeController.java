package com.quizplus.user_management;

import com.quizplus.user_management.model.Role;
import com.quizplus.user_management.model.Users;
import com.quizplus.user_management.service.RoleService;
import com.quizplus.user_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class HomeController {
    @Autowired
    RoleService RoleService;
   @GetMapping("/")
   public String home() {
       return "Hello World";
   }
   @GetMapping("/roles")
   public List<Role> getRoles() {
       return RoleService.findAll();
   }
    @RequestMapping(method = RequestMethod.POST ,value = "/roles")
    public void addRole(@RequestBody Role role) {

        RoleService.addRole(role);
    }

}
