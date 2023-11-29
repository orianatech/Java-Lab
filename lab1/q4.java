//4.	Write a program to sort array of integers. Sort it in ascending &descending order.

import java.util.Arrays;

public class q4 {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 5, 8, 2, 7, 1, 6, 4, 3, 9};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        reverseArray(numbers);
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }

    // Method to reverse the order of elements in the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}

