package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller  // Change from @RestController to @Controller
public class HelloController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "home"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "about"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("services")
    public String services(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "services"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("testimonial")
    public String testimonial(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "testimonial"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("contact")
    public String contact(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "contact"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("blog")
    public String blog(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "blog"; // Returns home.html from src/main/resources/templates/
    }
    @GetMapping("blog-detail")
    public String blogdetail(Model model) {
        model.addAttribute("name", "Spring Boot User"); 
        return "blog-detail"; // Returns home.html from src/main/resources/templates/
    }
}
