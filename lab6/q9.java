//9. Write a Java program to reverse an array of integer values.

public class q9 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for reversal, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for reversal operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Reverse numeric array
        reverseArray(numericArray);
        System.out.println("Reversed Numeric Array: " + arrayToString(numericArray));

        // Reverse string array
        reverseArray(stringArray);
        System.out.println("Reversed String Array: " + arrayToString(stringArray));
    }

    private static String arrayToString(int[] numericArray) {
        return null;
    }

    private static void reverseArray(int[] numericArray) {
    }

    // Method to reverse an array of any type
    private static <T> void reverseArray(T[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Method to convert an array to a string for printing
    private static String arrayToString(Object[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
