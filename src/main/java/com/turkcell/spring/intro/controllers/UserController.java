package com.turkcell.spring.intro.controllers;

import com.turkcell.spring.intro.entities.Book;
import com.turkcell.spring.intro.entities.User;
import com.turkcell.spring.intro.repositories.BookRepository;
import com.turkcell.spring.intro.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody User user){
        userRepository.save(user);
    }
}
