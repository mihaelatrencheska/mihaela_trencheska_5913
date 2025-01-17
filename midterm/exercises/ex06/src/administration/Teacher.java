package administration;

class Teacher {
    private String id;
    private String name;
    private String subject;
    private double salary;

    public Teacher(String id, String name, String subject, double salary) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}