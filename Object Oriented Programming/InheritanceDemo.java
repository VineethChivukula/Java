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
}

// Multilevel Inheritance: Class Puppy inherits from class Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
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
}

// Hierarchical Inheritance: Classes Lion and Tiger inherit from class Animal
class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void growl() {
        System.out.println("Tiger growls");
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