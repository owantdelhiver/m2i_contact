package com.owen.contacts.api;



import com.owen.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ContactRestController {
    @Autowired
    ContactService contactService;

    @GetMapping("/contacts")
    public ResponseEntity fetchAll() {
        return ResponseEntity.ok(contactService.findAll());
    }
}
