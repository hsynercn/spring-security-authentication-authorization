package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

// Add the controller
@RestController
class Helloworld {
    @GetMapping("/")
    public String greet() {
        return "Gökçebayır köyü satılık arsa ve zeytinlikler tel:0506£$%682-";
    }
}
