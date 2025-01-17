package management;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.stream.Collectors;

public class HospitalDemo {
    private static List<management.Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        List<String> patientNames = new ArrayList<>();
        patientNames.add("John Doe");
        patientNames.add("Jane Smith");
        patientNames.add("Alice Johnson");
        patientNames.add("Bob Brown");
        patientNames.add("Charlie Davis");
        patientNames.add("Diana Evans");
        patientNames.add("Eve Foster");
        patientNames.add("Frank Green");
        patientNames.add("Grace Harris");
        patientNames.add("Henry Irving");

        Random random = new Random();

        patients = patientNames.stream()
                .map(name -> {
                    String[] parts = name.split(" ");
                    String firstName = parts[0];
                    String lastName = parts[1];
                    String patientNumber = "P-" + String.format("%04d", random.nextInt(10000));
                    int roomNumber = 100 + random.nextInt(300);
                    return new management.Patient(patientNumber, firstName, lastName, roomNumber);
                })
                .collect(Collectors.toList());

        patients.forEach(HospitalDemo::displayPatient);

        List<management.Patient> filteredPatients = patients.stream()
                .filter(patient -> patient.getRoomNumber() >= 200 && patient.getRoomNumber() < 300)
                .filter(patient -> patient.getRoomNumber() % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Patients:");
        filteredPatients.forEach(HospitalDemo::displayPatient);
    }

    public static management.Patient registerPatient(String firstName, String lastName) {
        Random random = new Random();
        String patientNumber = "P-" + String.format("%04d", random.nextInt(10000));
        int roomNumber = 100 + random.nextInt(300);
        return new management.Patient(patientNumber, firstName, lastName, roomNumber);
    }

    public static void displayPatient(management.Patient patient) {
        System.out.println("Patient Number: " + patient.getPatientNumber());
        System.out.println("First Name: " + patient.getFirstName());
        System.out.println("Last Name: " + patient.getLastName());
        System.out.println("Room Number: " + patient.getRoomNumber());
        System.out.println();
    }
}
