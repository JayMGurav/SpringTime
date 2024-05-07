package com.example.demo.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;
}
