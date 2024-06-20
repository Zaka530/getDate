package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
    public class MainController {

        @GetMapping("/api/v1/getDate")
        public LocalDate getCurrentDate() {
            return LocalDate.now();
        }

    }
