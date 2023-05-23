package com.example.restemplate.services;

import com.example.restemplate.entity.Contact;

import com.example.restemplate.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;



    public List<Contact> getContact(Long userId)
    {
        return contactRepository.findByUserId(userId);
    }


    public Contact createNewContact(Contact contact) {
        Contact contact1=new Contact();
        contact1.setEmail(contact.getEmail());
        contact1.setUserId(contact.getUserId());
        contact1.setPhoneNumber(contact.getPhoneNumber());

       return contactRepository.save(contact1);
    }

    public List<Contact> getAllContacts() {
       return contactRepository.findAll();
    }
}
