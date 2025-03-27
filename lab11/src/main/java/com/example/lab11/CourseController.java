package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private String title = "Spring Boot Basics";
    private int duration = 5; // Duration in weeks

    @GetMapping("/course")
    public String getCourse() {
        return "Course: " + title + ", Duration: " + duration + " weeks";
    }
}