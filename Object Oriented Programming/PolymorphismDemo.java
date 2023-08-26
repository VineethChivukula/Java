// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void playFetch() {
        System.out.println("Dog plays fetch");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        System.out.println("Compile-time Polymorphism (Method Overloading):");
        print(5);
        print("Hello");

        // Runtime polymorphism (method overriding)
        System.out.println("\nRuntime Polymorphism (Method Overriding):");

        // Creating objects
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling overridden methods
        myAnimal.makeSound(); // Calls Animal's makeSound
        myDog.makeSound();    // Calls Dog's makeSound
        myCat.makeSound();    // Calls Cat's makeSound

        // Using type-specific methods
        Dog myDogObj = new Dog();
        Cat myCatObj = new Cat();

        myDogObj.playFetch(); // Calls Dog's playFetch
        myCatObj.scratch();   // Calls Cat's scratch
    }

    // Compile-time polymorphism (method overloading)
    static void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    static void print(String text) {
        System.out.println("Printing string: " + text);
    }
}