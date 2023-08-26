class MyClass {
    // Static variable (class variable)
    static int staticVar = 10;

    // Instance variable
    int instanceVar;

    // Static method
    static void staticMethod() {
        // Static methods cannot access instance variables directly
        // Uncommenting the following line would result in a compilation error:
        // System.out.println("Instance variable: " + instanceVar);

        System.out.println("Static method called");
        System.out.println("Static variable: " + staticVar);
    }

    // Instance method
    void instanceMethod() {
        // Instance methods can access static variables directly
        System.out.println("Instance method called");
        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
    }
}

public class StaticMembersDemo {
    public static void main(String[] args) {
        // Accessing static members
        System.out.println("Accessing static members:");
        System.out.println("Static variable: " + MyClass.staticVar);
        MyClass.staticMethod();

        // Creating objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Modifying instance variables
        obj1.instanceVar = 5;
        obj2.instanceVar = 7;

        // Accessing instance members
        System.out.println("\nAccessing instance members:");
        obj1.instanceMethod();
        obj2.instanceMethod();

        // Static members can be accessed using the class name
        System.out.println("\nAccessing static members via class name:");
        System.out.println("Static variable: " + MyClass.staticVar);
        MyClass.staticMethod();

        // Static members can also be accessed using an object reference, but it's not recommended
        // System.out.println("\nAccessing static members via object reference (not recommended):");
        // System.out.println("Static variable: " + obj1.staticVar);
        // obj1.staticMethod();
    }
}