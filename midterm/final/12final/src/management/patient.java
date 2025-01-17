package management;

public class patient {
    private String patientNumber;
    private String firstName;
    private String lastName;
    private int roomNumber;


    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // toString method for printing patient details
    @Override
    public String toString() {
        return "Patient Number: " + patientNumber +
                ", Name: " + firstName + " " + lastName +
                ", Room Number: " + roomNumber;
    }
}