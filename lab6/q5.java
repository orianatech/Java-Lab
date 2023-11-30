//5. Write a Java program to find the index of an array element.

public class q5 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for indexOf, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for indexOf operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Element to find in the arrays
        int targetElement = 7;

        // Find the index of the target element in numeric array
        final int indexNumeric = indexOfElement(numericArray, targetElement);
        System.out.println("Index of " + targetElement + " in Numeric Array: " + indexNumeric);

        // Find the index of the target element in string array
        int indexString = indexOfElement(stringArray, Integer.toString(targetElement));
        System.out.println("Index of " + targetElement + " in String Array: " + indexString);
    }

    private static int indexOfElement(int[] numericArray, int targetElement) {
        return 0;
    }

    // Method to find the index of an element in an array
    private static <T> int indexOfElement(T[] array, T targetElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetElement)) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }
}
