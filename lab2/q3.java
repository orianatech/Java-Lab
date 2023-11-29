package lab2;

//3.	Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {8, 2, 5, 1, 7, 3, 6, 4};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        // Sorting the numeric array in ascending order
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending Order): " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));

        // Sorting the string array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending Order): " + Arrays.toString(stringArray));
    }
}
