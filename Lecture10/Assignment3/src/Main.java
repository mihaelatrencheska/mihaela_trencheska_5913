import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static Student createStudent(String name, int age, int indexNum){
        return new Student(name, age, indexNum);
    }
    public static void printData(Student s){
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("IndexNum: " + s.getIndexNum());
    }

    public static void main(String[] args) {
        List<String> nameList= Arrays.asList("Anna", "Barbara", " Clio", "Silvia");
        Random random= new Random();
        nameList.stream().map(name->createStudent(name, (random.nextInt(12)+18),(random.nextInt(10000-1)+1))).forEach(student -> printData(student));
        List<Student>students = nameList.stream().map(name->createStudent(name, (random.nextInt(12)+18),(random.nextInt(10000-1)+1))).collect(Collectors.toList());
        List<Student> studentsResult= students.stream().filter(student -> student.getName().startsWith("C")).collect(Collectors.toList());
        studentsResult.stream().forEach(student -> printData(student));

        System.out.println("The age is less than 25: "+ students.stream().allMatch(student -> student.getAge()<25000));
        studentsResult.stream().anyMatch(student -> student.getAge()<25000);
    }
}