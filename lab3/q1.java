//1.	Write a program to implement method overloading.

public class q1 {

    // Method with two int parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        System.out.println("Sum of two ints: " + add(5, 10));
        System.out.println("Sum of three ints: " + add(5, 10, 15));
        System.out.println("Sum of two doubles: " + add(5.5, 10.5));
    }
}
