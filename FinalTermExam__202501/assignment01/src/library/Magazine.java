package library;

public class Magazine extends  Publication{
    public int issueNumber;
    public boolean printedMonthly;

    public Magazine(int issueNumber, boolean printedMonthly) {
        this.issueNumber = issueNumber;
        this.printedMonthly = printedMonthly;
    }

    public Magazine() {
    }

    @Override
    public abstract void printDetails(){
        System.out.println("Issue Number: "+ issueNumber);
        System.out.println("Printed monthly: "+ printedMonthly);
    }


}
