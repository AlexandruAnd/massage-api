package org.fasttrackit.massageapi.exeption;

public class PatientNotFoundExeption extends RuntimeException {
    public PatientNotFoundExeption(String message) {
        super(message);
    }
}
