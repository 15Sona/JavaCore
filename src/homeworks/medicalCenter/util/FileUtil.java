package homeworks.medicalCenter.util;
import homeworks.medicalCenter.storage.DoctorStrorage;
import homeworks.medicalCenter.storage.PatientStrorage;
import java.io.*;

public abstract class FileUtil {
    private static final String DOCTOR_DATA_FILE = "C://Users//user//IdeaProjects//JavaCore//src//homeworks//medicalCenter//data//doctorsData.txt";
    private static final String PATIENT_DATA_FILE = "C://Users//user//IdeaProjects//JavaCore//src//homeworks//medicalCenter//data//patientsData.txt";

    public static void serializeDoctorData(DoctorStrorage doctorStrorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
            objectOutputStream.writeObject(doctorStrorage);
        } catch (FileNotFoundException e) {
            System.out.println("file not fount for doctor data" + e);
        } catch (IOException e) {
            System.out.println("failed to Serialize doctor data" + e);
        }
    }

    public static void serializePatientData(PatientStrorage patientStrorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            objectOutputStream.writeObject(patientStrorage);
        } catch (FileNotFoundException e) {
            System.out.println("file not fount for Patient data" + e);
        } catch (IOException e) {
            System.out.println("failed to Serialize Patient data" + e);
        }
    }

    public static DoctorStrorage deserializeDoctorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if(obj instanceof DoctorStrorage doctorStrorage){
                return doctorStrorage;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not fount for Doctor data" + e);
        } catch (IOException e) {
            System.out.println("failed to Deserialize Doctor data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new DoctorStrorage();
    }

    public static PatientStrorage deserializePatientStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if(obj instanceof PatientStrorage patientStrorage){
                return patientStrorage;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not fount for Patient data" + e);
        } catch (IOException e) {
            System.out.println("failed to Deserialize Patient data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStrorage();
    }
}
