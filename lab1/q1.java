//1.	Write a java program to display Area of circle. Consider radius=4.

public class q1 {
    public static void main(String[] args) {
        // Given radius
        double radius = 4.0;

        // Calculate area
        double area = areaOfCircule(radius);

        // Display the result
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + area);
    }

    // Method to calculate the area of a circle
    public static double areaOfCircule(double radius) {
        return Math.PI * radius * radius;
    }
}
