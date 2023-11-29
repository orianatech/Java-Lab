//7.	Write a java program to add all of the numbers up to 10 (Use recursion)

public class q7 {
    public static void main(String[] args) {
        int result = sumUpTo(10);
        System.out.println("Sum of numbers up to 10: " + result);
    }

    // Recursive method to calculate the sum of numbers up to n
    public static int sumUpTo(int n) {
        // Base case: when n is 0, the sum is 0
        if (n == 0) {
            return 0;
        } else {
            // Recursive case: sum of numbers up to n is n + sum of numbers up to (n-1)
            return n + sumUpTo(n - 1);
        }
    }
}

