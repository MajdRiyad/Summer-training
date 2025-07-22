package com.quizplus.user_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Branch {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String address;

    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "is_main_branch")
    private boolean isMainBranch ;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
    @OneToMany(mappedBy ="branch")
    List<Users> users ;
}
