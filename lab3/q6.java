//6.	Create an abstract class pen with methods write () and refill () as abstract methods. Use the PEN class with additional method change_Nib ()

// Abstract Pen class
abstract class Pen {
    // Abstract method to write
    abstract void write();

    // Abstract method to refill
    abstract void refill();

    // Concrete method to change nib
    void changeNib() {
        System.out.println("Changing the nib of the pen.");
    }
}

// Concrete implementation of Pen class
class BallpointPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing with a ballpoint pen.");
    }

    @Override
    void refill() {
        System.out.println("Refilling the ballpoint pen.");
    }
}

// Main class to demonstrate the usage
public class q6 {
    public static void main(String[] args) {
        // Create an instance of BallpointPen
        BallpointPen ballpointPen = new BallpointPen();

        // Call abstract methods
        ballpointPen.write();
        ballpointPen.refill();

        // Call the concrete method
        ballpointPen.changeNib();
    }
}

