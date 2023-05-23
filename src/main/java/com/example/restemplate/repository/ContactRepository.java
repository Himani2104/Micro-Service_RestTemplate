package com.example.restemplate.repository;

import com.example.restemplate.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Long> {
    List<Contact> findByUserId(Long userId);
}
