package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;

import java.io.Serializable;

public class PatientStrorage implements Serializable {
    private Patient[] patients = new Patient[10];
    private int size = 0;
    public void addPatient(Patient patient){

        if (existByID(patient.getCardId())) {
            System.out.println("Patient with ID [" + patient.getCardId() + "] already exists!");
            return;
        }
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
        System.out.println("Patient successfully added");

    }
    private boolean existByID(String id){
        for (int i = 0; i < size; i++) {
            if(patients[i].getCardId().equals(id)){
                return true;
            }

        }
        return false;

    }
    private void extend() {
        Patient[] tmp = new  Patient[size + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);

        }
    }

    public void printAllPatientsByDoctor(Doctor id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor() == id) {
                System.out.println(patients[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No patients registered for this doctor");
        }
    }
}


