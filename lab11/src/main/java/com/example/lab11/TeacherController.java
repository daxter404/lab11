package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    private String name = "Mr. John";
    private String subject = "Mathematics";

    @GetMapping("/teacher")
    public String getTeacher() {
        return "Teacher: " + name + ", Subject: " + subject;
    }
}
