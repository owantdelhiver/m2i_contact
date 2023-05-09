package com.owen.contacts.entity;

import jakarta.persistence.Entity;

@Entity
public class Contact extends UserAbstract{
    private String surnom;
    public Contact() {
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}