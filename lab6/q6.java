//6. Write a Java program to remove a specific element from an array.


import java.util.Arrays;

public class q6 {
   /**
     * @param args
     */
     public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for removal, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for removal operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Element to remove from the arrays
        int targetElement = 7;

        // Remove the target element from numeric array
        numericArray = removeElement(numericArray, targetElement);
        System.out.println("Numeric Array after removing " + targetElement + ": " + Arrays.toString(numericArray));

        // Remove the target element from string array
        stringArray = removeElement(stringArray, Integer.toString(targetElement));
        System.out.println("String Array after removing " + targetElement + ": " + Arrays.toString(stringArray));
    }

    private static int[] removeElement(int[] numericArray, int targetElement) {
    return null;
}

    // Method to remove an element from an array
    private static <T> T[] removeElement(T[] array, T targetElement) {
        int index = indexOfElement(array, targetElement);

        if (index != -1) {
            // Create a new array without the target element
            T[] newArray = Arrays.copyOf(array, array.length - 1);
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            return newArray;
        }

        // If the element is not found, return the original array
        return array;
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
