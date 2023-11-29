//8.	Write a recursive function to calculate factorial of given number.

public class q8 {
    public static void main(String[] args) {
        // Calculate and display the factorial of a given number
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + ": " + factorial);
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: factorial of n is n multiplied by factorial of (n-1)
            return n * calculateFactorial(n - 1);
        }
    }
}
