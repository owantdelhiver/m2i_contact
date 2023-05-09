package com.owen.contacts.webController;

import com.owen.contacts.entity.Contact;
import com.owen.contacts.entity.User;
import com.owen.contacts.service.ContactService;
import com.owen.contacts.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/secured")
public class ContactWebController {
    @Autowired
    UserService userService;
    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    public String fetchAll(Model model) {
        model.addAttribute("user", userService.findById(1));
        return "contact";
    }

    @GetMapping("/contact/create")
    public String createContact(Model model) {
        User user = userService.findById(1);
        Contact contact = new Contact();

        model.addAttribute("user", user);
        model.addAttribute("contact", contact);

        return "create_contact";
    }

    @PostMapping("/contact/create")
    public String createContactPost(Model model, Contact contact) {
        User user = userService.findById(1);
        user.getContacts().add(contact);
        userService.save(user);
        return "redirect:/secured/contact";
    }

    @GetMapping("/contact/delete")
    public String deleteContact(@PathParam("id_contact") int id_contact) {
        contactService.delete(id_contact);
        return "redirect:/secured/contact";
    }
}
