package lab2;

//1.	Write a program to implement constructor, parameterized constructor and constructor overloading

public class q1 {
    // Instance variables
    private int value1;
    private int value2;

    // Default constructor
    public q1() {
        System.out.println("Default Constructor Called");
        // Default values
        value1 = 0;
        value2 = 0;
    }

    // Parameterized constructor
    public q1(int v1, int v2) {
        System.out.println("Parameterized Constructor Called");
        // Set values based on parameters
        value1 = v1;
        value2 = v2;
    }

    // Constructor overloading
    public q1(int v1) {
        System.out.println("Constructor Overloading Called");
        // Set value1 based on parameter, leave value2 as 0
        value1 = v1;
        value2 = 0;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
    }

    public static void main(String[] args) {
        // Using default constructor
        q1 obj1 = new q1();
        System.out.println("Values using Default Constructor:");
        obj1.displayValues();
        System.out.println();

        // Using parameterized constructor
        q1 obj2 = new q1(10, 20);
        System.out.println("Values using Parameterized Constructor:");
        obj2.displayValues();
        System.out.println();

        // Using constructor overloading
        q1 obj3 = new q1(5);
        System.out.println("Values using Constructor Overloading:");
        obj3.displayValues();
    }
}
