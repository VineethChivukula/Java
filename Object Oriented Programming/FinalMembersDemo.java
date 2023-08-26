class FinalMembers {
    // Final variable (constant)
    final int finalVar;

    // Final method (cannot be overridden)
    final void finalMethod() {
        System.out.println("Final method called");
    }

    // Constructor (can initialize a final variable)
    FinalMembers() {
        // You can initialize finalVar in the constructor, but you cannot reassign it.
        finalVar = 20;
    }

    // Method with final argument (cannot be modified within the method)
    void modifyFinalArg(final int arg) {
        // Uncommenting the following line would result in a compilation error:
        // arg = 30; // Cannot modify a final argument
        System.out.println("Final argument: " + arg);
    }
}

public class FinalMembersDemo {
    public static void main(String[] args) {
        FinalMembers obj = new FinalMembers();

        // Accessing a final variable
        System.out.println("Accessing finalVar: " + obj.finalVar);

        // Calling a final method
        obj.finalMethod();

        // Calling a method with a final argument
        obj.modifyFinalArg(40);
    }
}