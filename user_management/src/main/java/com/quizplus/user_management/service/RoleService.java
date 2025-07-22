package com.quizplus.user_management.service;

import com.quizplus.user_management.model.Role;
import com.quizplus.user_management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
    public Role findById(Long id) {
        return roleRepository.findById(id).get();
    }
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
