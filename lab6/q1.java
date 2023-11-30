
//1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        // Sorting a numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        // Sorting the numeric array in ascending order
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending): " + Arrays.toString(numericArray));

        // Sorting a string array
        String[] stringArray = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));

        // Sorting the string array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));
    }
}

