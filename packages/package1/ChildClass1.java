package packages.package1;

public class ChildClass1 extends Class1 {
    public void accessProtectedMethod() {
        // ChildClass1 can access the protected method because it extends Class1
        protectedMethod();
    }

    public static void main(String[] args) {
        // Create an instance of ChildClass1
        ChildClass1 childObj1 = new ChildClass1();

        // Access the protected method from ChildClass1
        childObj1.accessProtectedMethod(); // This is now accessible

        // Access public and package-private methods from ChildClass1
        childObj1.publicMethod();
        childObj1.packagePrivateMethod();
    }
}