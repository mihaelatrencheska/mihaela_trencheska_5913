public class Demo {

    public static Student createStudent(String fullName, String yearOfStudy, double id) {
        return new Student(fullName, yearOfStudy, id);
    }

    public static void print(Student student) {
        System.out.println(student);
    }
}

