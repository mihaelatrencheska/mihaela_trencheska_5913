package hr;

import java.util.ArrayList;
import java.util.List;

public class PayrollDemo {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add employees to the list
        employees.add(new FullTimeEmployee("Alice Johnson", "FT001", 50000, 10000));
        employees.add(new FullTimeEmployee("Bob Smith", "FT002", 60000, 15000));
        employees.add(new PartTimeEmployee("Charlie Brown", "PT001", 20000, 50, 20));
        employees.add(new PartTimeEmployee("Daisy Evans", "PT002", 25000, 40, 25));

        // Calculate and display total payroll
        double totalPayroll = employees.stream()
                .mapToDouble(Employee::calculateSalary)
                .sum();
        System.out.println("Total Payroll: " + totalPayroll);

        // Display employees with salary above a threshold
        double threshold = 60000;
        System.out.println("\nEmployees with salary above " + threshold + ":");
        employees.stream()
                .filter(employee -> employee.calculateSalary() > threshold)
                .forEach(Employee::printDetails);
    }
}
