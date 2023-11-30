//3. Write a Java program to calculate the average value of array elements.



public class q3 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for average, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for average calculations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Calculate average of numeric array
        double averageNumeric = calculateAverage(numericArray);
        System.out.println("Average of Numeric Array: " + averageNumeric);

        // Calculate average of string array (converted to integers)
        int[] intArray = convertStringArrayToIntArray(stringArray);
        double averageString = calculateAverage(intArray);
        System.out.println("Average of String Array (converted to integers): " + averageString);
    }

    // Method to calculate the average of an array of integers
    private static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
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
