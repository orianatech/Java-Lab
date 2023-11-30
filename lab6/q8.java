//8. Write a Java program to find the maximum and minimum value of an array.


public class q8 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for min/max, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for min/max operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Find the maximum and minimum values in numeric array
        int maxNumeric = findMax(numericArray);
        int minNumeric = findMin(numericArray);

        System.out.println("Numeric Array: " + arrayToString(numericArray));
        System.out.println("Maximum value in Numeric Array: " + maxNumeric);
        System.out.println("Minimum value in Numeric Array: " + minNumeric);

        // Find the maximum and minimum values in string array (converted to integers)
        int[] intArray = convertStringArrayToIntArray(stringArray);
        int maxString = findMax(intArray);
        int minString = findMin(intArray);

        System.out.println("\nString Array (converted to integers): " + arrayToString(intArray));
        System.out.println("Maximum value in String Array: " + maxString);
        System.out.println("Minimum value in String Array: " + minString);
    }

    // Method to find the maximum value in an array of integers
    private static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Method to find the minimum value in an array of integers
    private static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Method to convert a string array to an array of integers
    private static int[] convertStringArrayToIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    // Method to convert an array to a string for printing
    private static String arrayToString(int[] array) {
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
