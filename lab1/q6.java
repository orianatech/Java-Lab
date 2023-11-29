//6.	Write a java program to implement class Employee

public class q6 {
    // Instance variables
    private int employeeId;
    private String name;
    private double salary;

    // Constructor
    public q6(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        // Creating an instance of Employee
        q6 employee1 = new q6(101, "Pritish Sir", 100000.0);

        // Displaying employee information
        System.out.println("Employee Information:");
        employee1.displayEmployeeInfo();

        // Updating employee information
        employee1.setSalary(155000.0);
        System.out.println("\nUpdated Employee Information:");
        employee1.displayEmployeeInfo();
    }
}

