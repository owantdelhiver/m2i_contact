package com.owen.contacts.webController;

import com.owen.contacts.entity.Contact;
import com.owen.contacts.entity.User;
import com.owen.contacts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/contact/create")
    public String createContact(@RequestParam("id_user") int id_user, Model model) {
        User user = userService.findById(id_user);
        Contact contact = new Contact();

        model.addAttribute("user", user);
        model.addAttribute("contact", contact);

        return "create_contact";
    }

    @PostMapping("/contact/create")
    public String createContactPost(@RequestParam("id_user") int id_user, Model model, Contact contact) {
        User user = userService.findById(id_user);
        user.getContacts().add(contact);
        userService.save(user);
        return "redirect:/secured/contact?id_user=1";
    }
}
