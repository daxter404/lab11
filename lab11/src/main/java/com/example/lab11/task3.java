package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class task3 {

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }


    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }


    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y) + ".";
    }


    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Division by zero is not allowed.";
        }
        return "The result of " + x + " divided by " + y + " is " + (x / y) + ".";
    }


    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        if (y == 0) {
            return "Modulo by zero is not allowed.";
        }
        return "The remainder when " + x + " is divided by " + y + " is " + (x % y) + ".";
    }


    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return "The result of " + base + " raised to the power of " + exp + " is " + Math.pow(base, exp) + ".";
    }
}
