package org.fasttrackit.massageapi.service;

import org.fasttrackit.massageapi.domain.Patient;
import org.fasttrackit.massageapi.persistance.PatientRepository;
import org.fasttrackit.massageapi.transfer.SavePatientRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient createPatient(SavePatientRequest request){
        LOGGER.info("Creating patient {}", request);
        Patient patient = new Patient();
        patient.setName(request.getName());
        patient.setDate(request.getDate());
        patient.setEmail(request.getEmail());
        patient.setPhone(request.getPhone());

        return patientRepository.save(patient);

    }
}
