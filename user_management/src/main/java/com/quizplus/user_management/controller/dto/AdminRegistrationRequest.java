package com.quizplus.user_management.controller.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AdminRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String companyName;
    private String addressBranch;
    private String departmentName;
}
