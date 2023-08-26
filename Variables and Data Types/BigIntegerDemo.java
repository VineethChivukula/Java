import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // Creating BigInteger objects
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        // Performing basic arithmetic operations
        BigInteger sum = bigInt1.add(bigInt2);
        BigInteger difference = bigInt1.subtract(bigInt2);
        BigInteger product = bigInt1.multiply(bigInt2);
        BigInteger quotient = bigInt1.divide(bigInt2);

        // Displaying results
        System.out.println("BigInteger 1: " + bigInt1);
        System.out.println("BigInteger 2: " + bigInt2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Comparing BigIntegers
        int comparison = bigInt1.compareTo(bigInt2);
        if (comparison == 0) {
            System.out.println("BigInteger 1 is equal to BigInteger 2");
        } else if (comparison < 0) {
            System.out.println("BigInteger 1 is less than BigInteger 2");
        } else {
            System.out.println("BigInteger 1 is greater than BigInteger 2");
        }

        // BigInteger power operation
        BigInteger powerResult = bigInt1.pow(5);
        System.out.println("BigInteger 1 raised to the power of 5: " + powerResult);
    }
}