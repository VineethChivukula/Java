package packages.package2;

public class Class2 {
    public void sayHello() {
        System.out.println("Hi, I am in package 2");
    }

    public void publicMethod() {
        System.out.println("This is a public method in package 2");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in package 2");
    }

    void packagePrivateMethod() {
        System.out.println("This is a package-private method in package 2");
    }
}