package lab4;

// Base class
class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Derived class overriding the makeSound method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Another derived class overriding the makeSound method
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate method overriding
public class q1 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Call the overridden method for each instance
        myDog.makeSound(); // This will print "Bark"
        myCat.makeSound(); // This will print "Meow"
    }
}

