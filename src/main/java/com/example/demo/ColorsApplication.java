package com.example.demo;

import com.example.demo.services.ColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class ColorsApplication implements CommandLineRunner {

    private ColorPrinter colorPrinter;

    public ColorsApplication(ColorPrinter colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    public static void main(String[] args){
        SpringApplication.run(ColorsApplication.class ,args);
    }

    @Override
    public void run(final String... args){
        log.info(colorPrinter.print());
    }
}
