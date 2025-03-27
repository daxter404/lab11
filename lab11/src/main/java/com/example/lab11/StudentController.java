package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private String name = "Ali";
    private int age = 21;

    @GetMapping("/student")
    public String getStudent() {
        return "Student: " + name + ", Age: " + age;
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        if (age >= 18) {
            return "Age " + age + ": You are an adult.";
        } else {
            return "Age " + age + ": You are not an adult.";
        }
    }

    @GetMapping("/update-student/age/{newAge}")
    public String setAge(@PathVariable int newAge) {
        this.age = newAge;
        return "Updated Student Age: " + age;
    }
}
