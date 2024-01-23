package com.workspace.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}