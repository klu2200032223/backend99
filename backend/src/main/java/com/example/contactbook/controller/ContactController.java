package com.example.contactbook.controller;

import com.example.contactbook.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "http://localhost:3000") // allow frontend
public class ContactController {

    private final List<Contact> contacts = new ArrayList<>();

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        contacts.add(contact);
        return contact;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
