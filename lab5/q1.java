package lab5;

// Create a program to ask the user for a real number and display its square root. Errors must be
// trapped using "try..catch".

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for a real number
            System.out.print("Enter a real number: ");
            double inputNumber = scanner.nextDouble();

            // Calculate and display the square root
            if (inputNumber < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }

            double squareRoot = Math.sqrt(inputNumber);
            System.out.println("Square root: " + squareRoot);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid real number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

