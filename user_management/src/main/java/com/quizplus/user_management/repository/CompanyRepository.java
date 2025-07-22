package com.quizplus.user_management.repository;

import com.quizplus.user_management.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
