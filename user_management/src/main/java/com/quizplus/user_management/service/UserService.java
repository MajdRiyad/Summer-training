package com.quizplus.user_management.service;

import com.quizplus.user_management.model.Users;
import com.quizplus.user_management.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;
    public Users addUser(Users user) {
        return usersRepository.save(user);
    }
    public Users updateUser(Users user) {
       return usersRepository.save(user);
    }
    public Users getUserById(Long id) {
        return usersRepository.findById(id).get();

    }
    public Users findUserByEmail(String email) {
        return usersRepository.findByEmail(email).get();
    }
    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }

}
