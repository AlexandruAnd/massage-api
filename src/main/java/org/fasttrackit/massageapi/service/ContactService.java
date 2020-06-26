package org.fasttrackit.massageapi.service;

import org.fasttrackit.massageapi.domain.Contact;
import org.fasttrackit.massageapi.exeption.ResurceNotFoundExeption;
import org.fasttrackit.massageapi.persistance.ContactRepository;
import org.fasttrackit.massageapi.transfer.contact.SaveContactRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactService.class);

    private final ContactRepository contactRepository;
    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact createContact(SaveContactRequest request){
        LOGGER.info("Creating contact{}", request);
        Contact contact = new Contact();
        contact.setEmail(request.getEmail());
        contact.setMessage(request.getMessage());
        contact.setName(request.getName());

        return contactRepository.save(contact);
    }

    public Contact getContat(long id){
        LOGGER.info("Retrieving contact {}", id);
        return contactRepository.findById(id).orElseThrow(() -> new ResurceNotFoundExeption("" +
                "Contact" + id + " not found"));
    }

    public void deleteContact(long id){
        LOGGER.info("Deleteing contact {}", id);
        contactRepository.deleteById(id);
    }

}
