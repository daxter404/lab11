package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class task5 {


    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(name = "x") double x,
            @RequestParam(name = "y") double y,
            @RequestParam(name = "operation") String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return "Result: " + (x + y);
            case "subtract":
                return "Result: " + (x - y);
            case "multiply":
                return "Result: " + (x * y);
            case "divide":
                if (y != 0) {
                    return "Result: " + (x / y);
                } else {
                    return "Division by zero is not allowed!";
                }
            default:
                return "Invalid operation! Please use add, subtract, multiply, or divide.";
        }
    }


    @GetMapping("/filter")
    public String filter(
            @RequestParam(name = "keyword") String keyword,
            @RequestParam(name = "category") String category) {
        // Simulate filtering logic
        return "Filtering results for keyword: " + keyword + " in category: " + category;
    }


    @GetMapping("/convert")
    public String convert(
            @RequestParam(name = "temperature") double temperature) {
        double fahrenheit = (temperature * 9 / 5) + 32;
        return "Temperature in Fahrenheit: " + fahrenheit;
    }


    @GetMapping("/discount")
    public String discount(
            @RequestParam(name = "originalPrice") double originalPrice,
            @RequestParam(name = "discountRate") double discountRate) {
        double discountAmount = (originalPrice * discountRate) / 100;
        double discountedPrice = originalPrice - discountAmount;
        return "Discounted Price: " + discountedPrice;
    }
}
