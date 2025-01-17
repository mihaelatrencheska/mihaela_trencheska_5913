package hr;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String id, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (hoursWorked * hourlyRate);
    }
}

