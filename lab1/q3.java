// 3.	Write a program to calculate an average of 3 integers, 4 floats and 1 array of 15 integers using function overloading.

public class q3 {

    // Method to calculate average of 3 integers
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method to calculate average of 4 floats
    public static double calculateAverage(float num1, float num2, float num3, float num4) {
        return (num1 + num2 + num3 + num4) / 4.0;
    }

    // Method to calculate average of an array of 15 integers
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Array is empty. Cannot calculate average.");
            return 0.0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum / (double) numbers.length;
    }

    public static void main(String[] args) {
        // Calculate and display average of 3 integers
        double intAverage = calculateAverage(5, 10, 15);
        System.out.println("Average of 3 integers: " + intAverage);

        // Calculate and display average of 4 floats
        double floatAverage = calculateAverage(2.5f, 3.5f, 4.0f, 5.0f);
        System.out.println("Average of 4 floats: " + floatAverage);

        // Calculate and display average of an array of 15 integers
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        double arrayAverage = calculateAverage(intArray);
        System.out.println("Average of array of 15 integers: " + arrayAverage);
    }
}
