package Operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        int addition = a + b;      // Addition
        int subtraction = a - b;   // Subtraction
        int multiplication = a * b; // Multiplication
        int division = a / b;      // Division
        int modulus = a % b;       // Modulus (remainder)

        // Assignment operators
        int x = 20;
        x += 5; // Equivalent to x = x + 5
        x -= 3; // Equivalent to x = x - 3
        x *= 2; // Equivalent to x = x * 2
        x /= 4; // Equivalent to x = x / 4

        // Comparison operators
        boolean isEqual = (a == b); // Equal to
        boolean isNotEqual = (a != b); // Not equal to
        boolean isGreater = (a > b); // Greater than
        boolean isLess = (a < b); // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b); // Less than or equal to

        // Logical operators
        boolean isTrue = true;
        boolean isFalse = false;
        boolean logicalAnd = isTrue && isFalse; // Logical AND
        boolean logicalOr = isTrue || isFalse; // Logical OR
        boolean logicalNot = !isTrue; // Logical NOT

        // Increment and Decrement operators
        int number = 5;
        number++; // Increment by 1
        int anotherNumber = 10;
        anotherNumber--; // Decrement by 1

        // Bitwise operators (for integer types)
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011
        int bitwiseAnd = num1 & num2; // Bitwise AND (result: 0001)
        int bitwiseOr = num1 | num2;  // Bitwise OR (result: 0111)
        int bitwiseXor = num1 ^ num2; // Bitwise XOR (result: 0110)
        int bitwiseComplement = ~num1; // Bitwise NOT (result: 1010)

        // Shift operators (for integer types)
        int num3 = 16; // Binary: 10000
        int leftShift = num3 << 2; // Left shift by 2 bits (result: 1000000)
        int rightShift = num3 >> 2; // Right shift by 2 bits (result: 0010)
        int zeroFillRightShift = num3 >>> 2; // Zero-fill right shift by 2 bits (result: 0010)

        // Conditional (Ternary) Operator
        int condition = 7;
        String message = (condition > 5) ? "Condition is true" : "Condition is false";

        // instanceof operator (for checking object types)
        String str = "Hello";
        boolean isString = str instanceof String;

        // Displaying results
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        System.out.println("\nAssignment Operators:");
        System.out.println("x after +=: " + x);

        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);

        System.out.println("\nLogical Operators:");
        System.out.println("isTrue && isFalse: " + logicalAnd);
        System.out.println("isTrue || isFalse: " + logicalOr);
        System.out.println("!isTrue: " + logicalNot);

        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("number++: " + number);
        System.out.println("anotherNumber--: " + anotherNumber);

        System.out.println("\nBitwise Operators:");
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        System.out.println("bitwiseOr: " + bitwiseOr);
        System.out.println("bitwiseXor: " + bitwiseXor);
        System.out.println("bitwiseComplement: " + bitwiseComplement);

        System.out.println("\nShift Operators:");
        System.out.println("leftShift: " + leftShift);
        System.out.println("rightShift: " + rightShift);
        System.out.println("zeroFillRightShift: " + zeroFillRightShift);

        System.out.println("\nConditional (Ternary) Operator:");
        System.out.println("message: " + message);

        System.out.println("\ninstanceof Operator:");
        System.out.println("isString: " + isString);
    }
}