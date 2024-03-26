package com.turkcell.spring.intro.controllers;

import com.turkcell.spring.intro.entities.Book;
import com.turkcell.spring.intro.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookRepository.save(book);
    }
}
