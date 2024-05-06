package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.Impl.ColorPrinterImpl;
import com.example.demo.services.Impl.EnglishBluePrinter;
import com.example.demo.services.Impl.EnglishGreenPrinter;
import com.example.demo.services.Impl.EnglishRedPrinter;
import com.example.demo.services.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }


    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
