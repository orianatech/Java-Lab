//10. Write a Java program to find the duplicate values of an array of integer values.


import java.util.HashMap;
import java.util.Map;

public class q10 {
    public static void main(String[] args) {
        // Numeric array with duplicates
        int[] numericArray = {5, 2, 8, 1, 7, 3, 2, 5, 1, 8, 9, 7};

        // Find and print duplicate values in numeric array
        findAndPrintDuplicates(numericArray);
    }

    // Method to find and print duplicate values in an array of integers
    private static void findAndPrintDuplicates(int[] array) {
        // Use a HashMap to track occurrences of each element
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Iterate through the array
        for (int value : array) {
            // Increment the count for each element in the map
            elementCountMap.put(value, elementCountMap.getOrDefault(value, 0) + 1);
        }

        // Print duplicate values
        System.out.print("Duplicate values in the array: ");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
