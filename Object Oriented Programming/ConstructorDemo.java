class Person {
    // Instance variables
    String name;
    int age;

    // Constructor 1: Default Constructor
    Person() {
        System.out.println("Default constructor called.");
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2: Parameterized Constructor
    Person(String name, int age) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.age = age;
    }

    // Constructor 3: Copy Constructor
    Person(Person otherPerson) {
        System.out.println("Copy constructor called.");
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Method to display person information
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice", 20); // Parameterized constructor

        // Creating a copy of person2 using the copy constructor
        Person person3 = new Person(person2); // Copy constructor

        // Displaying person information
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();

        System.out.println("\nPerson 3 (copy of Person 2):");
        person3.displayInfo();
    }
}