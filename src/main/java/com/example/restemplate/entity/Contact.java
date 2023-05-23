package com.example.restemplate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contact {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String email;

    private String phoneNumber;

    private Long userId;
}
