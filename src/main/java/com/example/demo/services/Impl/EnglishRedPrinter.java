package com.example.demo.services.Impl;

import com.example.demo.services.RedPrinter;
import org.springframework.stereotype.Component;


public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}