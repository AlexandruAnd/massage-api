package org.fasttrackit.massageapi.persistance;

import org.fasttrackit.massageapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact>findByNameContaining(String partialName);

}
