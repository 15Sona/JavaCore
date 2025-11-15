package homeworks.medicalCenter.model;

import homeworks.medicalCenter.DoctorProfetion;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Person implements Serializable {
    private String id;
    private String email;
    private DoctorProfetion profession;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, DoctorProfetion profession) {
        super(name, surname, phoneNumber);
        this.id = id;
        this.email = email;
        this.profession = profession;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DoctorProfetion getProfession() {
        return profession;
    }

    public void setProfession(DoctorProfetion profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) && Objects.equals(email, doctor.email) && profession == doctor.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, email, profession);
    }

    @Override
    public String toString() {
        return "Doctor Information:" +
                "ID: " + id +
                " Name: " + getName() + " " + getSurname() +
                " Phone: " + getPhoneNumber() +
                " Email: " + email +
                " Profession: " + profession;
    }

}