package org.fasttrackit.massageapi.service;

import org.fasttrackit.massageapi.domain.Patient;
import org.fasttrackit.massageapi.exeption.PatientNotFoundExeption;
import org.fasttrackit.massageapi.persistance.PatientRepository;
import org.fasttrackit.massageapi.transfer.SavePatientRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

    public Patient createPatient(SavePatientRequest request) {
        LOGGER.info("Creating patient {}", request);
        Patient patient = new Patient();
        patient.setName(request.getName());
        patient.setDate(request.getDate());
        patient.setEmail(request.getEmail());
        patient.setPhone(request.getPhone());

        return patientRepository.save(patient);

    }

    public Patient getPatient(long id) {
        LOGGER.info("Retriving patient {}", id);

        return patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundExeption(
                "Patient " + id + " not found"));

    }



    public Patient updatePatient(long id, SavePatientRequest request){
        LOGGER.info("Updateing patient information {}: {} ", id , request);
        Patient patient = getPatient(id);
        BeanUtils.copyProperties(request, patient);

        return patientRepository.save(patient);
    }

    public void deletePatient(long id){
        LOGGER.info("Deleting patient {}", id);
        patientRepository.deleteById(id);
    }
}
