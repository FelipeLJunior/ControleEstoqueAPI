package br.com.akstore.controleestoque.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.akstore.controleestoque.models.entities.Branch;
import br.com.akstore.controleestoque.models.repositories.BranchRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchRepository branchRepository; 

    @GetMapping
    public Optional<Branch> getBranchById(@RequestParam Long id) {
        return branchRepository.findById(id);
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public void saveBranch(@Valid Branch branch) {
        branchRepository.save(branch);
    }
    
    @DeleteMapping
    public void deleteBranchById(@RequestParam Long id) {
        branchRepository.deleteById(id);
    }
}
