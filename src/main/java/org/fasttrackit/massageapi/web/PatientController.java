package org.fasttrackit.massageapi.web;

import org.fasttrackit.massageapi.domain.Patient;
import org.fasttrackit.massageapi.service.PatientService;
import org.fasttrackit.massageapi.transfer.patient.SavePatientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;
    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@Valid @RequestBody SavePatientRequest request){
        Patient patient = patientService.createPatient(request);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }
}
