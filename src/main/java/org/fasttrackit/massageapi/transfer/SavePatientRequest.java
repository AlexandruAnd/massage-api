package org.fasttrackit.massageapi.transfer;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SavePatientRequest {

    @NotNull
    private String name;
    @NotNull
    private LocalDate date;
    @NotNull
    private Long phone;
    @NotNull
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SavePatientRequest{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
