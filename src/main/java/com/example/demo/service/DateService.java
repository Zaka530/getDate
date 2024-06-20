package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
