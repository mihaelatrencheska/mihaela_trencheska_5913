package management;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Undergraduate("U001", "Alice Johnson", 3.8, "Computer Science"));
        students.add(new Undergraduate("U002", "Bob Smith", 3.5, "Mechanical Engineering"));

        students.add(new Postgraduate("P001", "Charlie Brown", 3.9, "AI and Machine Learning"));
        students.add(new Postgraduate("P002", "Daisy Evans", 4.0, "Renewable Energy Systems"));

        System.out.println("All Student: ");
        students.forEach(Student :: printDetails);

        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getGpa))
                .orElse(null);
        if (topStudent != null){
            System.out.println("Top student: ");
            topStudent.printDetails();
        }
        if (topStudent != null){
            System.out.println("Top Student: ");
            students.stream()
                    .filter((student -> student instanceof Undergraduate))
                    .forEach(Student :: printDetails);
            System.out.println("Postgraduate Student: ");
            students.stream()
                    .filter(student -> student instanceof Postgraduate)
                    .forEach(Student::printDetails);
        }

    }
}
