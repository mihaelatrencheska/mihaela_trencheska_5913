public class Engine {
    private boolean started;

    public Engine() {
        this.started = false;
    }

    public void startEngine() {
        if (this.started) {
            System.out.println("The engine is already started");

        } else {
            this.started = true;
        }
    }

    public void stopEngine() {
        if (this.started) {
            this.started = false;

        } else {
            System.out.println("The engine is off");
        }
    }
}
