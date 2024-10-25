public class Wheel {

    private boolean inflated;

    public Wheel() {
        this.inflated = true;
    }
    public void inflateWheel(){
        if(this.inflated){
            System.out.println("The wheel is already inflated");
        }
        else{
            this.inflated = true;
        }
    }
    public void deflateWheel(){
        if(this.inflated){
            this.inflated = false;
        }
        else{
            System.out.println("The wheel is already deflated");
        }
    }
}

