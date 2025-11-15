package homeworks.medicalCenter;
import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.storage.DoctorStrorage;
import homeworks.medicalCenter.storage.PatientStrorage;
import homeworks.medicalCenter.util.FileUtil;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Demo implements Commands {
    static private final Scanner scanner = new Scanner(System.in);
    static private final DoctorStrorage doctorStrorage = FileUtil.deserializeDoctorStorage();
    static private final PatientStrorage patientStrorage = FileUtil.deserializePatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStrorage);
                    break;

                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.print("Enter doctor ID to change: ");
                    String changeId = scanner.nextLine();
                    doctorStrorage.changeDoctorById(changeId);
                    FileUtil.serializeDoctorData(doctorStrorage);
                    break;

                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    FileUtil.serializeDoctorData(doctorStrorage);
                    break;
                case ADD_DOCTOR_THEN_PATIENT_DATA:
                    addPatient();
                    FileUtil.serializePatientData(patientStrorage);
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;

                case PRINT_ALL_PATIENTS:
                    patientStrorage.printAllPatients();
                    break;



                default:
                    System.out.println("Wrong command!");
            }
        }
    }

        public static void printCommands(){

            System.out.println("Enter " + EXIT + " to EXIT");
            System.out.println("Enter " + ADD_DOCTOR + " to ADD A NEW DCOTOR");
            System.out.println("Enter " + SEARCH_DOCTOR_BY_PROFESSION + " to SEARCH DOCTORS BY PRFFESTION: " +
                    "Copy from this list: PEDIATRICIAN, CARDIOLOGIST, NEUROLOGIST, NEUROLOGIST");
            System.out.println("Enter " + CHANGE_DOCTOR_BY_ID + " to change doctor's personal info");

            System.out.println("Enter " + DELETE_DOCTOR_BY_ID + " to DELETE DOCTOR BY ID");
            System.out.println("Enter " + ADD_DOCTOR_THEN_PATIENT_DATA + " to ADD DOCTOR AND THEN add PATIENT DATA");
            System.out.println("Enter " + PRINT_ALL_PATIENT_BY_DOCTOR + " to PRINT ALL PATIENT BY DOCTOR");
            System.out.println("Enter " + PRINT_ALL_PATIENTS + " to PRINT ALL PATIENT");

        }

        private static void addDoctor () {
            System.out.println("Please input doctor name: ");
            String doctorName = scanner.nextLine();

            System.out.println("Please input doctor surname: ");
            String doctorSurename = scanner.nextLine();

            System.out.println("Please input doctor phoneNumber: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Please input doctor ID: ");
            String doctorID = scanner.nextLine();

            System.out.println("Please input doctor email address: ");
            String doctorEmail = scanner.nextLine();


            System.out.println("Please input profession Copy from this list: PEDIATRICIAN, CARDIOLOGIST, NEUROLOGIST, NEUROLOGIST ");
            String docProf = scanner.nextLine();
            DoctorProfetion profession = DoctorProfetion.valueOf(docProf.toUpperCase());

            Doctor doctor = new Doctor(doctorID, doctorName, doctorSurename,  phoneNumber,  doctorEmail, profession);
            doctorStrorage.addDoctor(doctor);
        }
        private static void searchDoctorByProfession () {
            System.out.println("Input profession (PEDIATRICIAN, CARDIOLOGIST, NEUROLOGIST, SURGEON: ");
            String profStr = scanner.nextLine();

            DoctorProfetion profession = DoctorProfetion.valueOf(profStr.toUpperCase());
            doctorStrorage.searchDoctorByProfesion(profession);

        }
        private static void deleteDoctorById () {
            System.out.println("Input doctor ID to delete:");
            String id = scanner.nextLine();

            doctorStrorage.deleteDoctorById(id);
        }
        private static void addPatient () {
            System.out.println("Enter doctor ID the patient will register to:");
            String doctorId = scanner.nextLine();

            Doctor doctor = doctorStrorage.getDoctorById(doctorId);
            if (doctor == null) {
                System.out.println("Doctor not found!");
                return;
            }

            System.out.println("Enter patient card ID:");
            String cardId = scanner.nextLine();

            System.out.println("Enter patient name:");
            String patientName = scanner.nextLine();

            System.out.println("Enter patient surname:");
            String patientSurname = scanner.nextLine();

            System.out.println("Enter patient phone:");
            String patientPhone = scanner.nextLine();

            Patient patient = new Patient(cardId, patientName, patientSurname, patientPhone, doctor, LocalDateTime.now());

            patientStrorage.addPatient(patient);
        }
        private static void printAllPatientsByDoctor () {
            System.out.println("Enter doctor ID:");
            String doctorId = scanner.nextLine();

            Doctor doctor = doctorStrorage.getDoctorById(doctorId);
            if (doctor == null) {
                System.out.println("Doctor not found!");
                return;
            }

            patientStrorage.printAllPatientsByDoctor(doctor);
        }
    }







