package lab4;

// Write a program to implement interface “Half” to calculate half value of a number passed as
// an argument to function calculateHalf().

// Interface Half
interface Half {
    double calculateHalf(double number);
}

// Class implementing the Half interface
class Calculator implements Half {
    // Implementing the calculateHalf method
    @Override
    public double calculateHalf(double number) {
        return number / 2;
    }
}

// Main class to demonstrate the usage
public class q5 {
    public static void main(String[] args) {
        // Create an object of Calculator
        Calculator calculator = new Calculator();

        // Calculate and print the half value of a number
        double result = calculator.calculateHalf(20.0);
        System.out.println("Half value: " + result);
    }
}
