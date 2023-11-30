package q4;

// Base class
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// First derived class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second derived class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class hira {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Accessing methods from the base class
        dog.speak();
        cat.speak();

        // Accessing methods from the derived classes
        dog.bark();
        cat.meow();
    }
}

