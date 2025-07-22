package com.quizplus.user_management.service;

import com.quizplus.user_management.model.Branch;
import com.quizplus.user_management.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;
    public List<Branch> getAllBranch() {
        return branchRepository.findAll();
    }
    public Branch findById(Long id) {
        return branchRepository.findById(id).get();
    }
    public Branch addBranch(Branch branch) {
        return branchRepository.save(branch);
    }
    public Branch updateBranch(Branch branch) {
        return branchRepository.save(branch);
    }
    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }

}
