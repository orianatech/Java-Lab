package q4;

// Base class
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Another derived class inheriting from Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Main class
public class multi {
    public static void main(String[] args) {
        // Create an instance of Puppy
        Puppy puppy = new Puppy();
        puppy.speak();  // Accessing method from the base class
        puppy.bark();   // Accessing method from the first derived class
        puppy.play();   // Accessing method from the second derived class
    }
}

