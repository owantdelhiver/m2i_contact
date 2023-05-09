package com.owen.contacts.webController;

import com.owen.contacts.service.ContactService;
import com.owen.contacts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secured")
public class ContactWebController {
    @Autowired
    UserService userService;

    @GetMapping("/contact")
    public String fetchAll(@RequestParam("id_user") int id_user, Model model) {
        model.addAttribute("user", userService.findById(id_user));
        return "contact";
    }
}
