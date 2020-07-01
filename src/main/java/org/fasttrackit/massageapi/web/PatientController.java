package org.fasttrackit.massageapi.web;

import org.fasttrackit.massageapi.domain.Patient;
import org.fasttrackit.massageapi.service.PatientService;
import org.fasttrackit.massageapi.transfer.patient.GetPatientRequest;
import org.fasttrackit.massageapi.transfer.patient.SavePatientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public ResponseEntity<Patient> createPatient(@Valid @RequestBody SavePatientRequest request) {
        Patient patient = patientService.createPatient(request);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable long id) {
        Patient patient = patientService.getPatient(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getPatients(GetPatientRequest request) {
        List<Patient> patients = patientService.getPatients(request);
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(
            @PathVariable long id, @Valid @RequestBody SavePatientRequest request) {
        Patient patient = patientService.updatePatient(id, request);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable long id) {
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
