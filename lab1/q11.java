//11.	Write a recursive function to display first 10 terms of Fibonacci series

public class q11 {
    public static void main(String[] args) {
        System.out.println("First 10 terms of Fibonacci series:");

        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate Fibonacci series term at index n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Fibonacci series is the sum of the two preceding ones
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

