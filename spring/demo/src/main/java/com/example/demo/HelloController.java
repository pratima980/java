package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Spring Boot User");
        return "home"; // Returns index.html from templates
    }
}
