package management;

class Reservation {
    private String reservationID;
    private String customerName;
    private int tableNumber;
    private String reservationTime;

    public Reservation(String reservationID, String customerName, int tableNumber, String reservationTime) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.reservationTime = reservationTime;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return "ReservationID: " + reservationID + ", Customer: " + customerName +
                ", Table: " + tableNumber + ", Time: " + reservationTime;
    }
}
