public class Door {
    private boolean opened;

    public Door() {
        this.opened = false;
    }

    private void openDoor() {
        if (this.opened) {
            System.out.println("The door is already opened");
        } else {
            this.opened = true;
        }
    }

    private void closeDoor() {
        if (this.opened) {
            this.opened = false;
        } else {
            System.out.println("The door is already closed");
        }
    }
}
