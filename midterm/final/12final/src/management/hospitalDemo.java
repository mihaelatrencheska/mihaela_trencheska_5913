package management;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class hospitalDemo {

    // Method to register a new patient
    public static patient registerPatient(String firstName, String lastName){
        Random random = new Random();
        String patientNumber= "P- "+ (random.nextInt(9000)+ 1000);
        int roomNumber = random.nextInt(300)+ 100;

        patient patient= new patient();
        patient.setPatientNumber(patientNumber);
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setRoomNumber(roomNumber);

        return patient;
    }
    // Method to display patient details
    public static void displayPatient(patient patient){
        System.out.println(patient);
    }

    public static void main(String[] args){
        // Step 1: Create an ArrayList of 10 patient names
        List<String> patientNames = List.of(
                "John Doe", "Jane Smith", "Alice Brown", "Bob White",
                "Charlie Black", "Diana Green", "Eve Gray", "Frank Blue",
                "Grace Red", "Hank Yellow"
        );

        // Step 2: Create Patient objects using streams
        List<patient> patients = patientNames.stream()
                .map(name -> {
                    String[] parts = name.split(" ");
                    return registerPatient(parts[0], parts[1]);
                })
                .collect(Collectors.toList());

        // Step 3: Print all patient details
        System.out.println("All Patients:");
        patients.forEach(hospitalDemo::displayPatient);

        // Step 4: Filter patients with room numbers between 200-299 and odd
        List<patient> filteredPatients = patients.stream()
                .filter(patient -> patient.getRoomNumber() >= 200 && patient.getRoomNumber() <= 299)
                .filter(patient -> patient.getRoomNumber() % 2 != 0)
                .collect(Collectors.toList());

        // Display the filtered list
        System.out.println("\nFiltered Patients (Room 200-299, Odd Numbers):");
        filteredPatients.forEach(hospitalDemo::displayPatient);

    }
}
