//4. Write a Java program to test if an array contains a specific value.


import java.util.Arrays;

public class q4 {
   /**
     * @param args
     */
     public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for contains, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for contains operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Value to check in the arrays
        int targetValue = 7;

        // Check if numeric array contains the target value
        boolean containsNumeric = containsValue(numericArray, targetValue);
        System.out.println("Numeric Array contains " + targetValue + ": " + containsNumeric);

        // Check if string array contains the target value
        boolean containsString = containsValue(stringArray, Integer.toString(targetValue));
        System.out.println("String Array contains " + targetValue + ": " + containsString);
    }

    private static boolean containsValue(String[] stringArray, String string) {
    return false;
}

    // Method to check if an array contains a specific value
    /**
     * @param <T>
     * @param numericArray
     * @param targetValue
     * @return
     */
    private static <T> boolean containsValue(int[] numericArray, int targetValue) {
        return !Arrays.asList(numericArray).contains(targetValue);
    }
}
