package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private String title = "Effective Java";
    private String author = "Joshua Bloch";
    private double price = 45.50;

    @GetMapping("/book")
    public String getBook() {
        return "Book: " + title + ", Author: " + author + ", Price: $" + price;
    }
}
