package com.example.demo;

import com.example.demo.services.ColorPrinter;
import com.example.demo.services.Impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class ColorsApplication implements CommandLineRunner {


    public static void main(String[] args){
        SpringApplication.run(ColorsApplication.class ,args);
    }

    @Override
    public void run(final String... args){
        final ColorPrinter colorPrinter = new ColorPrinterImpl();
        log.info(colorPrinter.print());
    }
}
