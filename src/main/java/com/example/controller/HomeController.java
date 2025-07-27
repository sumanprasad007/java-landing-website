package com.example.controller;

import com.example.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactForm contactForm, Model model) {
        // In a real application, you would save the contact form to a database
        // or send an email. For this example, we just acknowledge receipt.
        model.addAttribute("successMessage", "Thank you for your message! We'll be in touch soon.");
        model.addAttribute("contactForm", new ContactForm());
        return "index";
    }
}