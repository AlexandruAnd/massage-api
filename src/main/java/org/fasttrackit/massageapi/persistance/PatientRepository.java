package org.fasttrackit.massageapi.persistance;

import org.fasttrackit.massageapi.domain.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {

    Page<Patient> findByNameContaining (String partialName, Pageable pageable);

    Page<Patient> findByNameContainingAndMassageContaining (String partialName, String partialMassage, Pageable pageable);

}
