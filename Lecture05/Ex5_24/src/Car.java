public class Car {
    private Engine engine;
    private Door[] door;
    private Wheel[] wheels;
    private boolean trunkOpened;

    public Car(int numDoors, int numWheels) {
        engine = new Engine();
        this.trunkOpened = false;

        for(int i = 0; i<numDoors; i++){
            door[i] = new Door();
        }

        for(int j = 0; j<numWheels; j++){
            wheels[j] = new Wheel();
        }
    }

    public void startEngine(){
        engine.startEngine();
    }

    public void openAllDoors(){
        for (int i = 0; i<doors.length; i++)  {
            doors[i] = new Door();
        }

    }
    public void inflateWheels(int index){
        wheels[index].inflateWheel();
    }

    public void deflateWheels(int index){
        wheels[index].deflateWheel();
    }
    public void openTrunk(){
        if (this.trunkOpened){
            System.out.println("The trunk is opened.");
        }
        else{
            this.trunkOpened = false;
        }
    }

    public void closeTrunk(){
        if (this.trunkOpened){
            this.trunkOpened = false;
        }
        else{
            System.out.println("The trunk is closed");
        }
    }
}

