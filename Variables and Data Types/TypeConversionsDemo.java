public class TypeConversionsDemo {
    public static void main(String[] args) {
        // Implicit type conversion (Widening)
        int intVar = 100;
        long longVar = intVar; // Implicitly converts int to long

        float floatVar = longVar; // Implicitly converts long to float
        double doubleVar = floatVar; // Implicitly converts float to double

        // Explicit type conversion (Casting)
        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // Explicitly converts double to int using casting

        char charValue = 'A';
        int charToInt = (int) charValue; // Explicitly converts char to int using casting

        // Printing values
        System.out.println("Implicit type conversions:");
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);

        System.out.println("\nExplicit type conversions:");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValue: " + intValue);
        System.out.println("charValue: " + charValue);
        System.out.println("charToInt: " + charToInt);
    }
}