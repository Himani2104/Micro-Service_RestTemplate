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

 /*   public User getUser(Long id) {
         User user=null;
         Optional<User> userOptional=userRepository.findById(id);
         if (userOptional.isPresent())
           user= userOptional.get();

         return user;

    }*/

   /* public User createNewUser(User user) {
        User user1=new User();
        user1.setName(user.getName());
        user1.setAge(user.getAge());
         userRepository.save(user1);
         return user1;

    }*/

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
