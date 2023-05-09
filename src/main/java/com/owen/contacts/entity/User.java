package com.owen.contacts.entity;

import jakarta.persistence.Entity;

@Entity
public class User extends UserAbstract{
    private String mot_de_passe;

    public User() {
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
}