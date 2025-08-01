package com.quizplus.user_management.repository;

import com.quizplus.user_management.enums.RoleType;
import com.quizplus.user_management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByType(RoleType type);
}
