package q4;
//4.	Write separate programs to implement Single, multilevel and Hierarchical inheritance.
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

// Main class
public class single {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        dog.speak();  // Accessing method from the base class
        dog.bark();   // Accessing method from the derived class
    }
}

