//2.	Write a program to calculate area of rectangle, circle and triangle using function overloading.

public class q2 {

    // Method to calculate area of rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of triangle
    public static double areaOfTriangle(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            System.out.println("Invalid shape for this method");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Calculate and display area of rectangle
        double rectangleArea = rectangleArea(5.0, 8.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate and display area of circle
        double circleArea = areaOfCircle(4.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate and display area of triangle
        double triangleArea = areaOfTriangle(6.0, 10.0, "triangle");
        System.out.println("Area of triangle: " + triangleArea);
    }
}

