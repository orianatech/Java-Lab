package lab4;

// We have to calculate the area of a rectangle, a square and a circle. Create an abstract class
// 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
// 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea'
// are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea'
// and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an
// object of class 'Area' and call all the three methods.


// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate rectangle area
    abstract double rectangleArea(double length, double breadth);

    // Abstract method to calculate square area
    abstract double squareArea(double side);

    // Abstract method to calculate circle area
    abstract double circleArea(double radius);
}

// Class Area containing methods to calculate area for rectangle, square, and circle
class Area extends Shape {
    // Method to calculate rectangle area
    @Override
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate square area
    @Override
    double squareArea(double side) {
        return side * side;
    }

    // Method to calculate circle area
    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class to demonstrate the usage
public class q4 {
    public static void main(String[] args) {
        // Create an object of class Area
        Area areaCalculator = new Area();

        // Calculate and print the area of rectangle, square, and circle
        double rectangleArea = areaCalculator.rectangleArea(5.0, 3.0);
        double squareArea = areaCalculator.squareArea(4.0);
        double circleArea = areaCalculator.circleArea(2.5);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
