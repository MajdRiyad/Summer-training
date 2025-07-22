package com.quizplus.user_management.service;

import com.quizplus.user_management.model.Company;
import com.quizplus.user_management.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
    public Company findById(Long id) {
        return companyRepository.findById(id).get();
    }
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

}
