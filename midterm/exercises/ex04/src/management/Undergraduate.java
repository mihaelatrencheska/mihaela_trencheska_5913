package management;

public class Undergraduate extends Student{
    private String major;

    public Undergraduate(String studentId, String name, double gpa, String major){
        super(studentId,name, gpa);
        this.major= major;
    }
    @Override
    public void printDetails(){
        System.out.println("Undergraduate Student: ");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: "+ name);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println();
    }
}
