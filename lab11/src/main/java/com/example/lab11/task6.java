package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class task6 {

    @GetMapping("/student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response;
    }

    @GetMapping("/course-info")
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Java Programming");
        response.put("description", "Learn the fundamentals of Java programming.");
        response.put("duration", "10 weeks");
        return response;
    }

    @GetMapping("/user-profile")
    public Map<String, Object> getUserProfile() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("email", "ali@example.com");
        response.put("role", "Student");
        return response;
    }

    @GetMapping("/product-details")
    public Map<String, Object> getProductDetails() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Smartphone");
        response.put("category", "Electronics");
        response.put("price", 599.99);
        response.put("stock_status", "In Stock");
        return response;
    }

    @GetMapping("/order-summary")
    public Map<String, Object> getOrderSummary() {
        Map<String, Object> response = new HashMap<>();
        response.put("order_id", "ORD12345");
        response.put("customer_name", "Ali");
        response.put("items", List.of("Smartphone", "Headphones"));
        response.put("total_cost", 749.99);
        return response;
    }
}
