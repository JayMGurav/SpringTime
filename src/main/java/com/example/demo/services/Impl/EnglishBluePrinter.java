package com.example.demo.services.Impl;

import com.example.demo.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "blue";
    }
}
