package com.example.restemplate.controller;

import com.example.restemplate.entity.Contact;

import com.example.restemplate.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;
  @GetMapping("contact/user/{userId}")
    public List<Contact> getContact(@PathVariable Long userId)
    {
     return   contactService.getContact(userId);
    }

    @PostMapping("/contact")
    public ResponseEntity<?> createContact(@RequestBody Contact contact)
    {
        return new ResponseEntity<>(contactService.createNewContact(contact),HttpStatus.OK);
    }

    @GetMapping("/contact")
    public ResponseEntity<?> getContacts()
    {
        return new ResponseEntity<>(contactService.getAllContacts(),HttpStatus.OK);
    }
}
