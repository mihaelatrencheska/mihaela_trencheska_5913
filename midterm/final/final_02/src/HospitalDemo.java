package management;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HospitalDemo {

    public static management.Patient registerPatient(String firstname, String lastName){
        Random random = new Random();
        String patientNumber = "P-" + String.format("%04d", random.nextInt(1000));
        int roomNumber= random.nextInt(200) + 100;
        return new management.Patient(firstname, lastName, patientNumber, roomNumber);
    }

    public static void displayPatient(management.Patient patient){
        patient.printDetails();
    }

    public static void main(String[] args) {
        List<String> patientNames = new ArrayList<>();
        patientNames.add("Luka Lukic");
        patientNames.add("Mihaela Trencheska");
        patientNames.add("Maja Naumova");
        patientNames.add("Daniel Trencheski");
        patientNames.add("Dejan Trencheski");
        patientNames.add("Fani Kiradzieva");
        patientNames.add("Nora Kiradzieva");
        patientNames.add("Valentina Kiradzieva");
        patientNames.add("Josip Vukic");
        patientNames.add("Jana Kanana");

        List<management.Patient>patients = patientNames.stream()
                .map(name ->{String[]nameParts = name.split("");
                    return registerPatient(nameParts[0],nameParts[1]);
                })
                .collect(Collectors.toList());

        System.out.println("All patient details: ");
        patients.forEach(HospitalDemo::displayPatient);

        List<management.Patient>filteredPatients = patients.stream()
                .filter(patient -> patient.getRoomNumber() >= 200 && patient.getRoomNumber() <= 299)
                .filter(patient -> patient.getRoomNumber() % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("\nFiltered Patients (Room Numbers 200-299 and Odd):");
        filteredPatients.forEach(HospitalDemo::displayPatient);
    }
}