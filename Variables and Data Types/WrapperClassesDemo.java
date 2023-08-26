public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Wrapper classes for primitive data types
        Byte byteObj = 127;                 // Byte wrapper class
        Short shortObj = 32767;             // Short wrapper class
        Integer intObj = 2147483647;        // Integer wrapper class
        Long longObj = 9223372036854775807L; // Long wrapper class

        Float floatObj = 3.1415927f;        // Float wrapper class
        Double doubleObj = 3.14159265359;   // Double wrapper class

        Character charObj = 'A';            // Character wrapper class
        Boolean booleanObj = true;          // Boolean wrapper class

        // Outputting values
        System.out.println("byteObj: " + byteObj);
        System.out.println("shortObj: " + shortObj);
        System.out.println("intObj: " + intObj);
        System.out.println("longObj: " + longObj);
        System.out.println("floatObj: " + floatObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("charObj: " + charObj);
        System.out.println("booleanObj: " + booleanObj);
    }
}
