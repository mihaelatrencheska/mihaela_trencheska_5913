package administration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SchoolDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("S1", "Alice", 10, 85.5),
                new Student("S2", "Bob", 10, 92.0),
                new Student("S3", "Charlie", 11, 76.8),
                new Student("S4", "Diana", 12, 88.1)
        ));

        List<Teacher> teachers = new ArrayList<>(Arrays.asList(
                new Teacher("T1", "Mr. Smith", "Math", 5000),
                new Teacher("T2", "Ms. Johnson", "Science", 5500),
                new Teacher("T3", "Mrs. Brown", "History", 5300)
        ));

        // Calculate average marks
        double avgMarks = students.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
        System.out.println("Average Marks: " + avgMarks);

        // Find teacher with the highest salary
        Teacher highestPaid = teachers.stream().max(Comparator.comparingDouble(Teacher::getSalary)).orElse(null);
        System.out.println("Highest Paid Teacher: " + highestPaid);
    }
}