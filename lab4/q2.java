package lab4;

//Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits
//this monkey class and implements basic animal interface with eat ( ) and sleep methods

// Interface for basic animal behavior
interface Animal {
    void eat();
    void sleep();
}

// Monkey class with jump() and bite() methods
class Monkey {
    void jump() {
        System.out.println("Monkey jumps");
    }

    void bite() {
        System.out.println("Monkey bites");
    }
}

// Human class inheriting from Monkey and implementing Animal interface
class Human extends Monkey implements Animal {
    // Implementing methods from the Animal interface
    @Override
    public void eat() {
        System.out.println("Human eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps");
    }
}

// Main class to demonstrate the usage
public class q2 {
    public static void main(String[] args) {
        // Create an instance of Human
        Human person = new Human();

        // Call methods from Monkey class
        person.jump();
        person.bite();

        // Call methods from Animal interface
        person.eat();
        person.sleep();
    }
}

