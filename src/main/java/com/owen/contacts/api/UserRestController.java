package com.owen.contacts.api;

import com.owen.contacts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
