package lab5;

// Write a program to accept product details like ProductName, ProductID, weight and Price.
// Design Exception InvalidWeight if the weight entered is less than 1000 Kg.

import java.util.Scanner;

// Custom exception for invalid weight
class InvalidWeightException extends Exception {
    InvalidWeightException(String message) {
        super(message);
    }
}

// Product class to store product details
class Product {
    private String productName;
    private String productID;
    private double weight;
    private double price;

    // Constructor to initialize product details
    public Product(String productName, String productID, double weight, double price) {
        this.productName = productName;
        this.productID = productID;
        this.weight = weight;
        this.price = price;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}

// Main class to demonstrate the usage
public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept product details from the user
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter Product ID: ");
            String productID = scanner.nextLine();

            System.out.print("Enter Weight (in Kg): ");
            double weight = scanner.nextDouble();

            // Check if weight is less than 1000 Kg, throw InvalidWeightException
            if (weight < 1000) {
                throw new InvalidWeightException("Invalid weight. Weight should be at least 1000 Kg.");
            }

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            // Create a Product object with the entered details
            Product product = new Product(productName, productID, weight, price);

            // Display the entered product details
            System.out.println("\nProduct Details:");
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Weight: " + product.getWeight() + " Kg");
            System.out.println("Price: $" + product.getPrice());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (InvalidWeightException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

