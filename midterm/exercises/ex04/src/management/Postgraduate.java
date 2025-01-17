package management;

public class Postgraduate extends Student{
    private String thesisTitle;

    public Postgraduate(String studentID, String name, double gpa, String thesisTitle) {
        super(studentID, name, gpa);
        this.thesisTitle = thesisTitle;
    }
    @Override
    public void printDetails(){
        System.out.println("Postgraduate Student: ");
        System.out.println("Student Id: "+ studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: "+ gpa);
        System.out.println("Thesis title: " + thesisTitle);
        System.out.println();
    }
}
