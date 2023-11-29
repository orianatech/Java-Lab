//10.	Write a recursive function to sort list of 10 numbers in ascending order.

import java.util.Arrays;

public class q10 {
    public static void main(String[] args) {
        // Sample array of 10 numbers
        int[] numbers = {8, 4, 1, 9, 3, 6, 2, 7, 5, 10};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order using recursion
        recursiveSort(numbers, 0, numbers.length - 1);

        // Display the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
    }

    // Recursive method to perform quicksort for sorting
    public static void recursiveSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index such that elements on the left are smaller, and elements on the right are greater
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays before and after the partition index
            recursiveSort(arr, low, partitionIndex - 1);
            recursiveSort(arr, partitionIndex + 1, high);
        }
    }

    // Helper method to partition the array and return the pivot index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (put the pivot in its correct place)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
