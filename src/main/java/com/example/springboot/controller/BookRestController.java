package com.example.springboot.controller;

import com.example.springboot.entity.Book;
import com.example.springboot.entity.BookDTO;
import com.example.springboot.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookRestController {

    public final BookService bookService;
    // GET : http://localhost:8081/api/book
    @GetMapping("/book")
    public List<BookDTO> books(){
        List<BookDTO> books=bookService.getAllBooksDTO();
        return books; //JSON(MessageConverter:순환참조문제X)
    }
}
