package org.fasttrackit.massageapi.web;

import org.fasttrackit.massageapi.domain.Contact;
import org.fasttrackit.massageapi.service.ContactService;
import org.fasttrackit.massageapi.transfer.contact.SaveContactRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/contacts")
@RestController
@CrossOrigin
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @PostMapping
    public ResponseEntity<Contact> createContact(@Valid @RequestBody SaveContactRequest request){
        Contact contact = contactService.createContact(request);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable long id){
        Contact contact = contactService.getContat(id);
        return new ResponseEntity<>(contact,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable long id){
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
