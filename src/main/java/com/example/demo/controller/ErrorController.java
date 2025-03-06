package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CustomException;

@RestController
public class ErrorController {

    @GetMapping("/exception")
    public String returnError() {
        // Simulate an error
        throw new CustomException("This is a custom error message");
    }
}