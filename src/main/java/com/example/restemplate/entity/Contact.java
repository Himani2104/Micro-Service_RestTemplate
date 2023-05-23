package com.example.restemplate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


public class Contact {


    private Long id;

    private String email;

    private Long userId;

    private String phoneNumber;
}
