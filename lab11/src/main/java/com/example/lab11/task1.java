package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class task1 {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return
                "<h2>Our Services </h2>"
                        + "<ul>"
                        + "<li>Web Development </li>"
                        + "<li>Mobile App Development </li>"
                        + "<li>SEO Optimization </li>"
                        + "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a description of our application. We provide amazing services to help you!";
    }

    @GetMapping("/faq")
    public String faq() {
        return "Frequently Asked Questions:\n1. What services do you provide? ...\n2. How can I contact support? ...";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "Contact Us: You can reach us at contact@ourcompany.com or call us at +123456789.";
    }

    @GetMapping("/team")
    public String team() {
        return "Our Team:\n1. John Doe - CEO\n2. Jane Smith - CTO\n3. Bob Johnson - Lead Developer";
    }
}