package management;

public abstract class Student {
    protected String studentID;
    protected String name;
    protected double gpa;

    public Student(String studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }
    public abstract void printDetails();

    public double getGpa(){
        return gpa;
    }
}
