package lab2;

//4.	Write a Java program to sum values of an array.

public class q4 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {8, 2, 5, 1, 7, 3, 6, 4};

        // Calculate the sum of values in the numeric array
        int sum = calculateArraySum(numericArray);

        // Display the result
        System.out.println("Numeric Array: " + arrayToString(numericArray));
        System.out.println("Sum of values in the numeric array: " + sum);
    }

    // Method to calculate the sum of values in an array
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to convert an array to a string for display
    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

