package com.example.contactform.controller;

import com.example.contactform.model.ContactMessage;
import com.example.contactform.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // For frontend access if needed
public class ContactController {

    @Autowired
    private ContactMessageRepository repository;

    @PostMapping
    @ResponseBody // Optional: if you're returning plain text instead of redirect or view
    public String handleForm(ContactMessage message) {
        repository.save(message);
        return "Message received successfully!";
    }
}
