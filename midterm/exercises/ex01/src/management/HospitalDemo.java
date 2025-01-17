package management;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HospitalDemo {
    public static Patient registerPatient(String firstName, String lastName) {
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);

        String patientNumber = "P- " + String.format("%04d", new Random().nextInt(10000));
        patient.setPatientNumber(patientNumber);

        int roomNumber = 100 + new Random().nextInt(300);
        patient.setRoomNumber(roomNumber);

        return patient;
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Patient number: " + patient.getPatientNumber());
        System.out.println("First Name: " + patient.getFirstName());
        System.out.println("Last Name: " + patient.getLastName());
        System.out.println("Room Number: " + patient.getRoomNumber());
    }

    public static void main(String[] args) {

        List<String> patientNames = Arrays.asList(
                "Alice Johnson", "Bob Smith", "Charlie Brown", "Diana Prince",
                "Eve Adams", "Frank Castle", "Grace Kelly", "Henry Ford",
                "Ivy Taylor", "Jack Daniels"
        );

        List<Patient> patients = patientNames.stream().map(name->{
            String[] parts = name.split(" ");
            return registerPatient(parts[0], parts[1]);
        }).collect(Collectors.toList());
        System.out.println("All Patient: ");
        patients.forEach(HospitalDemo::displayPatient);

        List<Patient> filteredPatient = patients.stream()
                .filter(p-> p.getRoomNumber() >= 200 && p.getRoomNumber()<= 299 && p.getRoomNumber() % 2 !=0)
                .collect(Collectors.toList());
        System.out.println("Filtered Patients (room 200-299 and odd: )");
        filteredPatient.forEach(HospitalDemo::displayPatient);
    }
}