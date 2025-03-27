package com.example.lab11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class task2 {

    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Twice the value of " + num + " is " + (num * 2) + ".";
    }


    @GetMapping("/length/{text}")
    public String lengthOfText(@PathVariable String text) {
        return "The length of the text is " + text.length() + ".";
    }


    @GetMapping("/reverse/{text}")
    public String reverseText(@PathVariable String text) {
        StringBuilder reversedText = new StringBuilder(text);
        return "The reversed text is: " + reversedText.reverse().toString();
    }


    @GetMapping("/concat/{str1}/{str2}")
    public String concatStrings(@PathVariable String str1, @PathVariable String str2) {
        return "The concatenated string is: " + str1 + str2;
    }

}