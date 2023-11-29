//2.	Write a program to implement static variable and static method.

public class q2 {

    // Static variable
    private static int staticVariable = 0;

    // Instance variable
    private int instanceVariable;

    // Constructor
    public q2(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        // Incrementing the static variable in the constructor
        staticVariable++;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Method to access the static variable
    public static int getStaticVariable() {
        return staticVariable;
    }

    // Method to access the instance variable
    public int getInstanceVariable() {
        return instanceVariable;
    }

    public static void main(String[] args) {
        // Creating instances of the class
        q2 obj1 = new q2(10);
        q2 obj2 = new q2(20);

        // Accessing static method
        q2.staticMethod();

        // Accessing instance method
        obj1.instanceMethod();

        // Accessing static and instance variables
        System.out.println("Static Variable: " + q2.getStaticVariable());
        System.out.println("Instance Variable of obj1: " + obj1.getInstanceVariable());
        System.out.println("Instance Variable of obj2: " + obj2.getInstanceVariable());
    }
}
