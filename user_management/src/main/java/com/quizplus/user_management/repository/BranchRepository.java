package com.quizplus.user_management.repository;

import com.quizplus.user_management.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
