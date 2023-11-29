//9.	Write a recursive function to display sum of all numbers between 5 - 10.

public class q9 {
    public static void main(String[] args) {
        // Calculate and display the sum of numbers between 5 and 10
        int start = 5;
        int end = 10;
        int sum = calculateSumBetween(start, end);
        System.out.println("Sum of numbers between " + start + " and " + end + ": " + sum);
    }

    // Recursive method to calculate the sum of numbers between start and end
    public static int calculateSumBetween(int start, int end) {
        // Base case: when start is greater than end, return 0
        if (start > end) {
            return 0;
        } else {
            // Recursive case: sum of numbers between start and end is start + sum of numbers between (start+1) and end
            return start + calculateSumBetween(start + 1, end);
        }
    }
}

