import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo {
    public static Student createStudent(String name, int indexNo, int age){
        return new Student()
                .setName(name)
                .setIndexNo(indexNo)
                .setAge(age);
    }
    public static void printValues(Student s){
        System.out.println("Name: " + s.getName()+ ", Index No"  + s.getIndexNo()+ ", Age: " + s.getAge());

    }
    public static void main(String[] args) {
        Random rand= new Random();
        List<String>names = Arrays.asList("Nikola", "Mihaela","Daniel" ,"Maja", "Filip");

     List<Student> students = names.stream()
             .map(name-> createStudent(name, rand.nextInt(10000)+1, rand.nextInt(13)+18))
             .collect(Collectors.toList());

     System.out.println("all students: ");
     students.forEach(Demo::printValues);

     List<Student>studentWithP = students.stream()
             .filter(s-> s.getName().startsWith("P"))
             .collect(Collectors.toList());

        System.out.println("Students with names starting with P: ");
        studentWithP.forEach(Demo::printValues);

        boolean allYoungerThan25 = students.stream().allMatch(s->s.getAge()>25);
        System.out.println("are all student younger than 25?" + allYoungerThan25);

        boolean allOlderThan25 = students.stream().allMatch(s->s.getAge()<25);
        System.out.println("are all student older than 25 ?" + allOlderThan25);

        boolean atLeastOneYoungerThan25 = students.stream().anyMatch(s -> s.getAge() < 25);
        System.out.println("Is at least one student younger than 25? " + atLeastOneYoungerThan25);
    }
}