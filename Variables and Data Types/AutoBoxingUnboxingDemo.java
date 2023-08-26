public class AutoBoxingUnboxingDemo {
    public static void main(String[] args) {
        // Auto boxing: Converting primitive types to their corresponding wrapper classes
        Integer intObj = 42; // Auto boxing int to Integer
        Double doubleObj = 3.14159; // Auto boxing double to Double
        Character charObj = 'A'; // Auto boxing char to Character
        Boolean boolObj = true; // Auto boxing boolean to Boolean

        // Unboxing: Converting wrapper classes back to primitive types
        int intVar = intObj; // Unboxing Integer to int
        double doubleVar = doubleObj; // Unboxing Double to double
        char charVar = charObj; // Unboxing Character to char
        boolean boolVar = boolObj; // Unboxing Boolean to boolean

        // Printing values
        System.out.println("intObj: " + intObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("charObj: " + charObj);
        System.out.println("boolObj: " + boolObj);

        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
    }
}
