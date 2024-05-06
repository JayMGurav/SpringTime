package com.example.demo.services.Impl;

import com.example.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class HindiRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "laal";
    }
}
