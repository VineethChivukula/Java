package packages;

// Import statements to access classes from different packages
import packages.package1.Class1;
import packages.package2.Class2;

// Main class
public class MainClass {
    public static void main(String[] args) {
        // Create instances of Class1 and Class2
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();

        // Accessing methods with different access modifiers

        // Public method from Class1 in package1
        obj1.publicMethod();
        
        // Call the sayHello method from Class1 in package1
        obj1.sayHello();

        // Uncommenting the following lines will result in compilation errors because
        // package-private and protected methods are not accessible from MainClass.

        // Package-private method from Class1 in package1
        // obj1.packagePrivateMethod();

        // Protected method from Class1 in package1
        // obj1.protectedMethod();

        // Private method is not accessible from MainClass
        // obj1.privateMethod();

        // Public method from Class2 in package2
        obj2.publicMethod();
        
        // Call the sayHello method from Class2 in package2
        obj2.sayHello();

        // Uncommenting the following lines will result in compilation errors for the same reasons
        // as mentioned above.
        
        // Package-private method from Class2 in package2
        // obj2.packagePrivateMethod();

        // Protected method from Class2 in package2
        // obj2.protectedMethod();

        // Private method is not accessible from MainClass
        // obj2.privateMethod();
    }
}