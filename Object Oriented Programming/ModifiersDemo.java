class Modifiers {
    // Public variable
    public int publicVar = 10;

    // Private variable
    private int privateVar = 20;

    // Default variable (package-private)
    int defaultVar = 30;

    // Protected variable
    protected int protectedVar = 40;

    // Final variable (constant)
    final int finalVar = 50;

    // Static variable
    static final int STATICFINALVAR = 60;

    // Method to change private variable
    void setPrivateVar(int value) {
        // Accessing and modifying the private variable within the class is allowed.
        privateVar = value;
    }

    // Method to access private variable
    int getPrivateVar() {
        // Accessing the private variable within the class is allowed.
        return privateVar;
    }
}

public class ModifiersDemo {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();

        // Accessing and changing public variable
        System.out.println("Accessing publicVar: " + obj.publicVar);
        obj.publicVar = 100; // Changing public variable is allowed
        System.out.println("Changed publicVar: " + obj.publicVar);

        // Accessing and changing protected variable
        System.out.println("Accessing protectedVar: " + obj.protectedVar);
        obj.protectedVar = 200; // Changing protected variable is allowed
        System.out.println("Changed protectedVar: " + obj.protectedVar);

        // Accessing and changing default variable
        System.out.println("Accessing defaultVar: " + obj.defaultVar);
        obj.defaultVar = 300; // Changing default variable is allowed
        System.out.println("Changed defaultVar: " + obj.defaultVar);

        // Accessing final variable (can't be changed)
        System.out.println("Accessing finalVar: " + obj.finalVar);
        // Uncommenting the following line would result in a compilation error:
        // obj.finalVar = 500; // Changing final variable is not allowed

        // Accessing static final variable (can't be changed)
        System.out.println("Accessing staticFinalVar: " + Modifiers.STATICFINALVAR);
        // Uncommenting the following line would result in a compilation error:
        // Modifiers.staticFinalVar = 700; // Changing static final variable is not allowed

        // Accessing private variable using a modifier method
        System.out.println("Accessing privateVar via getPrivateVar(): " + obj.getPrivateVar());
        obj.setPrivateVar(400); // Changing private variable using a modifier method is allowed
        System.out.println("Changed privateVar via setPrivateVar(): " + obj.getPrivateVar());
    }
}