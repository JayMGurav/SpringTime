package com.example.demo.services.Impl;

import com.example.demo.services.RedPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HindiRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "laal";
    }
}
