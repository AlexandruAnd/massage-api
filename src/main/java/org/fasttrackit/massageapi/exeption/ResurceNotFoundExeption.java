package org.fasttrackit.massageapi.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResurceNotFoundExeption extends RuntimeException {
    public ResurceNotFoundExeption(String message) {
        super(message);
    }
}
