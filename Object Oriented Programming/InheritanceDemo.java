// Base class (parent)
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Single Inheritance: Class Dog inherits from class Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    // Constructor that calls the superclass constructor using super()
    Dog() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dog object created");
    }
}

// Multilevel Inheritance: Class Puppy inherits from class Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }

    // Constructor that calls the superclass constructor using super()
    Puppy() {
        super(); // Calls the constructor of the superclass (Dog)
        System.out.println("Puppy object created");
    }
}

// Multiple Inheritance: Class Cat inherits from class Animal and implements an interface
interface Sound {
    void makeSound();
}

class Cat extends Animal implements Sound {
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    // Constructor that calls the superclass constructor using super()
    Cat() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Cat object created");
    }
}

// Hierarchical Inheritance: Classes Lion and Tiger inherit from class Animal
class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars");
    }

    // Constructor that calls the superclass constructor using super()
    Lion() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Lion object created");
    }
}

class Tiger extends Animal {
    void growl() {
        System.out.println("Tiger growls");
    }

    // Constructor that calls the superclass constructor using super()
    Tiger() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Tiger object created");
    }
}

// Hybrid Inheritance: Class Dolphin inherits from class Animal and implements an interface
interface Swim {
    void swim();
}

class Dolphin extends Animal implements Swim {
    @Override
    void eat() {
        System.out.println("Dolphin eats fish");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swims");
    }

    // Constructor that calls the superclass constructor using super()
    Dolphin() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dolphin object created");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();

        // Multiple Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();

        // Hierarchical Inheritance
        Lion lion = new Lion();
        lion.eat();
        lion.roar();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.growl();

        // Hybrid Inheritance
        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.swim();
    }
}