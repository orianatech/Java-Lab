package lab2;

//5.	Write a Java program to test if an array contains a specific value


public class q5 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {8, 2, 5, 1, 7, 3, 6, 4};
        
        // Value to search for
        int searchValue = 7;

        // Check if the numeric array contains the specified value
        boolean containsValue = arrayContainsValue(numericArray, searchValue);

        // Display the result
        System.out.println("Numeric Array: " + arrayToString(numericArray));
        System.out.println("Does the array contain the value " + searchValue + "? " + containsValue);
    }

    // Method to check if an array contains a specific value
    public static boolean arrayContainsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true; // Value found
            }
        }
        return false; // Value not found
    }

    // Method to convert an array to a string for display
    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

