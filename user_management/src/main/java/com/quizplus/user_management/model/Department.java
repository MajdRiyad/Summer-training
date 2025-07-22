package com.quizplus.user_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
    @OneToMany(mappedBy = "department")
    List<Users> users;


}
