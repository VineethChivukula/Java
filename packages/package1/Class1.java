package packages.package1;

public class Class1 {
    public void sayHello() {
        System.out.println("Hi, I am in package 1");
    }

    public void publicMethod() {
        System.out.println("This is a public method in package 1");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in package 1");
    }

    void packagePrivateMethod() {
        System.out.println("This is a package-private method in package 1");
    }
}