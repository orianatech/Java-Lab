//2. Write a Java program to sum values of an array.

public class q2 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for sum, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for sum operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Calculate sum of numeric array
        int sumNumeric = calculateSum(numericArray);
        System.out.println("Sum of Numeric Array: " + sumNumeric);

        // Calculate sum of string array (converted to integers)
        int[] intArray = convertStringArrayToIntArray(stringArray);
        int sumString = calculateSum(intArray);
        System.out.println("Sum of String Array (converted to integers): " + sumString);
    }

    // Method to calculate the sum of an array of integers
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to convert a string array to an array of integers
    private static int[] convertStringArrayToIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}
