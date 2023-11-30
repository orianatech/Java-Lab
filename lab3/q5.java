//5.	Write a program to implement method overloading.

public class q5 {

    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the methods with different parameter types
        int result1 = add(5, 10);
        int result2 = add(5, 10, 15);
        double result3 = add(3.5, 2.5);

        // Display the results
        System.out.println("Sum of two integers: " + result1);
        System.out.println("Sum of three integers: " + result2);
        System.out.println("Sum of two doubles: " + result3);
    }
}

