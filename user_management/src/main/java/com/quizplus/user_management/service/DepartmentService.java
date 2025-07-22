package com.quizplus.user_management.service;

import com.quizplus.user_management.model.Department;
import com.quizplus.user_management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
