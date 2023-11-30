//7. Write a Java program to insert an element (specific position) into an array.


import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 3};

        // String array (not applicable for insertion, just for demonstration)
        // Note: In a real scenario, you would use a numeric array for insertion operations.
        String[] stringArray = {"10", "20", "30", "40"};

        // Element to insert into the arrays
        int elementToInsert = 12;
        int positionToInsert = 2; // Index starts from 0

        // Insert the element into numeric array
        numericArray = insertElement(numericArray, elementToInsert, positionToInsert);
        System.out.println("Numeric Array after inserting " + elementToInsert +
                " at position " + positionToInsert + ": " + Arrays.toString(numericArray));

        // Insert the element into string array
        stringArray = insertElement(stringArray, Integer.toString(elementToInsert), positionToInsert);
        System.out.println("String Array after inserting " + elementToInsert +
                " at position " + positionToInsert + ": " + Arrays.toString(stringArray));
    }

    private static int[] insertElement(int[] numericArray, int elementToInsert, int positionToInsert) {
        return null;
    }

    // Method to insert an element into an array at a specific position
    private static <T> T[] insertElement(T[] array, T element, int position) {
        if (position < 0 || position > array.length) {
            System.out.println("Invalid position. Cannot insert element.");
            return array; // Return the original array if position is invalid
        }

        // Create a new array with increased length
        T[] newArray = Arrays.copyOf(array, array.length + 1);

        // Shift elements to make space for the new element
        System.arraycopy(array, 0, newArray, 0, position);
        System.arraycopy(array, position, newArray, position + 1, array.length - position);

        // Insert the new element at the specified position
        newArray[position] = element;

        return newArray;
    }
}
