package com.example.model;

import lombok.Data;

@Data
public class ContactForm {
    private String name;
    private String email;
    private String subject;
    private String message;
}