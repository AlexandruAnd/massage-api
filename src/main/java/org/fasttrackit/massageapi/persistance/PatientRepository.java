package org.fasttrackit.massageapi.persistance;

import org.fasttrackit.massageapi.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {


}
