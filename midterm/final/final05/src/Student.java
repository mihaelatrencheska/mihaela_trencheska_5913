public class Student {
    private String name;
    private int indexNo;
    private int age;

    // Fluent Setter for name
    public Student setName(String name) {
        this.name = name;
        return this; // Return current instance
    }

    // Fluent Setter for indexNo
    public Student setIndexNo(int indexNo) {
        this.indexNo = indexNo;
        return this; // Return current instance
    }

    // Fluent Setter for age
    public Student setAge(int age) {
        this.age = age;
        return this; // Return current instance
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public int getAge() {
        return age;
    }
}


