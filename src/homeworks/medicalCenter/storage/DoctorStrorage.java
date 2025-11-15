package homeworks.medicalCenter.storage;

import homeworks.medicalCenter.DoctorProfetion;
import homeworks.medicalCenter.model.Doctor;

import java.io.Serializable;
import java.util.Scanner;


public class DoctorStrorage implements Serializable {
    static private final Scanner scanner = new Scanner(System.in);

    private Doctor[] doctors = new Doctor[10];

    private int size = 0;

    public void addDoctor(Doctor doctor) {

        if (existByID(doctor.getId())) {
            System.out.println("Doctor with ID [" + doctor.getId() + "] already exists!");
            return;
        }
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
        System.out.println("Doctor successfully added");

    }

    private boolean existByID(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return true;
            }

        }
        return false;

    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;

    }

    public void searchDoctorByProfesion(DoctorProfetion profetion) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession() == profetion) {
                System.out.println(doctors[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctor with this profession");
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {

                // shift left to remove element
                for (int j = i; j < size - 1; j++) {
                    doctors[j] = doctors[j + 1];
                }

                doctors[size - 1] = null;
                size--;

                System.out.println("Doctor with ID [" + id + "] removed successfully.");
                return;
            }
        }
        System.out.println("No doctor found with ID: " + id);
    }

    public void changeDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                Doctor doctor = doctors[i];

                System.out.println("Doctor found:");
                System.out.println(doctor);
                System.out.println("Now enter new values (ID cannot be changed):");


                System.out.print("Enter new name (" + doctor.getName() + "): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) doctor.setName(newName);


                System.out.print("Enter new surname (" + doctor.getSurname() + "): ");
                String newSurname = scanner.nextLine();
                if (!newSurname.isEmpty()) doctor.setSurname(newSurname);


                System.out.print("Enter new phone (" + doctor.getPhoneNumber() + "): ");
                String newPhone = scanner.nextLine();
                if (!newPhone.isEmpty()) doctor.setPhoneNumber(newPhone);


                System.out.print("Enter new email (" + doctor.getEmail() + "): ");
                String newEmail = scanner.nextLine();
                if (!newEmail.isEmpty()) doctor.setEmail(newEmail);


                System.out.print("Enter new profession (" + doctor.getProfession() + "), options: ");
                for (DoctorProfetion p : DoctorProfetion.values()) {
                    System.out.print(p + " ");
                }
                System.out.println();

                String newProf = scanner.nextLine();
                if (!newProf.isEmpty()) {
                    doctor.setProfession(DoctorProfetion.valueOf(newProf.toUpperCase()));
                }

                System.out.println("Doctor updated successfully!");
                System.out.println(doctor);
                return;
            }
        }
        System.out.println("No doctor found with ID: " + id);
    }


    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return doctors[i];
            }
        }
        return null;
    }


}
