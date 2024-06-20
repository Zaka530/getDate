package com.example.demo.controller;

import com.example.demo.service.DateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class MainController {

    private final DateService dateService;

    @GetMapping("/api/v1/getDate")
    public String getCurrentDate() {
        return dateService.getCurrentDate();
    }

}
