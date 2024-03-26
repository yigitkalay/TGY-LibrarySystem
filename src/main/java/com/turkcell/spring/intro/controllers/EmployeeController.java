package com.turkcell.spring.intro.controllers;

import com.turkcell.spring.intro.entities.Employee;
import com.turkcell.spring.intro.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
}
