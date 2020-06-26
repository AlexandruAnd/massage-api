package org.fasttrackit.massageapi.persistance;

import org.fasttrackit.massageapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
