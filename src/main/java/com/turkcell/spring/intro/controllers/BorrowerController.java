package com.turkcell.spring.intro.controllers;

import com.turkcell.spring.intro.entities.Borrower;
import com.turkcell.spring.intro.repositories.BorrowerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrower")
@RequiredArgsConstructor
public class BorrowerController {
    private final BorrowerRepository borrowerRepository;

    @GetMapping("/getAll")
    public List<Borrower> getAll(){
        return borrowerRepository.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Borrower borrower){
        borrowerRepository.save(borrower);
    }
}
