package hr;

public abstract class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: "+ id);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Total salary: "+ calculateSalary());

    }
}
