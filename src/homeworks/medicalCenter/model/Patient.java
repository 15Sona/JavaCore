package homeworks.medicalCenter.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Patient extends Person implements Serializable {
    private String cardId;
    private Doctor doctor;
    private LocalDateTime registerDateTime;

    public Patient(String cardId, String name, String surname, String phoneNumber,
                   Doctor doctor, LocalDateTime registerDateTime) {
        super(name, surname, phoneNumber);
        this.cardId = cardId;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        registerDateTime = registerDateTime;
    }

    @Override
    public String toString() {
        String formattedDate = registerDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        return "Patient Information:" +
                " Card ID: " + cardId +
                " Name: " + getName() + " " + getSurname() +
                " Phone: " + getPhoneNumber() +
                " Doctor: " + doctor.getName() + " " + doctor.getSurname() +
                " (" + doctor.getProfession() + ")" +
                " Registered: " + formattedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(cardId, patient.cardId)
                && Objects.equals(doctor, patient.doctor)
                && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardId, doctor, registerDateTime);
    }
}
