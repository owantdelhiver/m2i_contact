package com.owen.contacts.service;

import com.owen.contacts.entity.Contact;
import com.owen.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Contact findById(int id) {
        return contactRepository.findById(id).get();
    }
    public void delete(int id) {
        contactRepository.deleteById(id);
    }
}
