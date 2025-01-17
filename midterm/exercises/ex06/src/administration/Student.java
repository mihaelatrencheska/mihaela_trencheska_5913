package administration;


class Student {
    private String id;
    private String name;
    private int grade;
    private double marks;

    public Student(String id, String name, int grade, double marks) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", marks=" + marks +
                '}';
    }
}
