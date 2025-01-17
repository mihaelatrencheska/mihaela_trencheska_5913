public class Student {
    private String name;
    private int indexNum;
    private int age;

    public Student(String name, int indexNum, int age) {
        this.name = name;
        this.indexNum = indexNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public int getAge() {
        return age;
    }
}
