package com.owen.contacts.entity;

import jakarta.persistence.Entity;

@Entity
public class Contact extends UserAbstract{
    private String surnom;
    private String telephone;
    public Contact() {
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}