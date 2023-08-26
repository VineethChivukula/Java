public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;                 // 8-bit signed integer
        short shortVar = 32767;             // 16-bit signed integer
        int intVar = 2147483647;            // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer (L suffix denotes a long literal)

        float floatVar = 3.1415927f;        // 32-bit floating-point
        double doubleVar = 3.14159265359;   // 64-bit floating-point (default for floating-point literals)

        char charVar = 'A';                 // 16-bit Unicode character
        boolean booleanVar = true;          // Represents true or false

        // Outputting values
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
    }
}
