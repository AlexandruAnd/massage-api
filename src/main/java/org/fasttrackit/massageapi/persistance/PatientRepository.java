package org.fasttrackit.massageapi.persistance;

import org.fasttrackit.massageapi.domain.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository <Patient, Long> {

    List<Patient> findByNameContaining (String partialName);

    List<Patient> findByNameContainingAndMassageContaining (String partialName, String partialMassage);

}
