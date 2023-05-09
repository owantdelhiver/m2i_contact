package com.owen.contacts.entity;

import jakarta.persistence.*;

@MappedSuperclass

public abstract class UserAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String img;
}
