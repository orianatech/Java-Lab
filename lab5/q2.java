package lab5;

// Write a main class and declare four objects of Calculator class. Perform addition (obj1),
// subtraction (obj2), multiply (obj3) and division (obj4) operations for these objects. If any non
// integer values are provided as input; then you should throw an exception
// (NumberFormatException) and display a message that informs the user of the wrong input.

import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create four objects of the Calculator class
            Calculator obj1 = new Calculator();
            Calculator obj2 = new Calculator();
            Calculator obj3 = new Calculator();
            Calculator obj4 = new Calculator();

            // Perform addition (obj1), subtraction (obj2), multiplication (obj3), and division (obj4) operations
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int resultAdd = obj1.add(num1, num2);
            int resultSubtract = obj2.subtract(num1, num2);
            int resultMultiply = obj3.multiply(num1, num2);
            int resultDivide = obj4.divide(num1, num2);

            System.out.println("Addition result: " + resultAdd);
            System.out.println("Subtraction result: " + resultSubtract);
            System.out.println("Multiplication result: " + resultMultiply);
            System.out.println("Division result: " + resultDivide);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

