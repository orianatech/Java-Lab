//5.	Write a program to display count of odd &even numbers stored in an array.

public class q5 {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 5, 8, 2, 7, 1, 6, 4, 3, 9};

        // Display the original array
        System.out.println("Array: ");
        displayArray(numbers);

        // Count and display the number of odd and even numbers
        int oddCount = countOddNumbers(numbers);
        int evenCount = countEvenNumbers(numbers);

        System.out.println("Count of odd numbers: " + oddCount);
        System.out.println("Count of even numbers: " + evenCount);
    }

    // Method to display the elements of the array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to count the number of odd numbers in the array
    private static int countOddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Method to count the number of even numbers in the array
    private static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

