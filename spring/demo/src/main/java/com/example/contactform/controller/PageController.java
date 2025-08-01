package com.example.contactform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact"; // This will load contact.html from src/main/resources/templates/
    }

    // Add more mappings if needed
    @GetMapping("/")
    public String home() {
        return "home"; // Loads home.html if you have it
    }
}
