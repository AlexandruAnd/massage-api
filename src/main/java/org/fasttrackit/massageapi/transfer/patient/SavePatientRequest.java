package org.fasttrackit.massageapi.transfer.patient;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SavePatientRequest {


    private String name;
    private LocalDate date;
    @NotNull
    private Long phone;
    private String email;
    private String massage;

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

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "SavePatientRequest{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", massage='" + massage + '\'' +
                '}';
    }
}
