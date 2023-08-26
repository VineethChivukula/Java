package Functions;

public class FunctionDemo {
    // 1. Method with no parameters and no return value (void)
    public static void greet() {
        System.out.println("Hello, there!");
    }

    // 2. Method with parameters and no return value (void)
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 3. Method with parameters and a return value
    public static int add(int x, int y) {
        return x + y;
    }

    // 4. Method with parameters and multiple return values (using an array)
    public static int[] divideAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        int[] result = { quotient, remainder };
        return result;
    }

    // 5. Method with variable-length arguments (varargs)
    public static double average(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // 6. Recursive method
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calling methods
        greet();

        int num1 = 5, num2 = 3;
        printSum(num1, num2);

        int sum = add(num1, num2);
        System.out.println("Result of add method: " + sum);

        int[] divisionResult = divideAndRemainder(10, 3);
        System.out.println("Quotient: " + divisionResult[0] + ", Remainder: " + divisionResult[1]);

        double avg = average(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Average: " + avg);

        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);
    }
}