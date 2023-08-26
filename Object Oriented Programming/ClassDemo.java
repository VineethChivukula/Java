// Concrete class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Creating an object of the concrete class
        Person person = new Person("John");
        person.introduce();

        // Using an inner class
        InnerDemo innerDemo = new InnerDemo();
        innerDemo.displayInner();

        // Using an anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous class!");
            }
        };
        greeting.greet();
    }

    // Inner class
    static class InnerDemo {
        void displayInner() {
            System.out.println("This is an inner class");
        }
    }

    // Interface for the anonymous class
    interface Greeting {
        void greet();
    }
}