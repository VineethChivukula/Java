import java.util.Arrays;
import java.util.List;

// Functional interface with a single abstract method
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionDemo {
    // Method that uses the MathOperation functional interface
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    public static void main(String[] args) {
        // 1. Lambda expression with parameters and a return statement
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("Addition: " + operate(10, 5, addition));

        // 2. Lambda expression with type inference
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + operate(10, 5, subtraction));

        // 3. Lambda expression as an argument to a method
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + operate(10, 5, multiplication));

        // 4. Lambda expression as a variable
        MathOperation division = (a, b) -> {
            if (b != 0) return a / b;
            else return 0;
        };
        System.out.println("Division: " + operate(10, 5, division));

        // 5. Lambda expression in a separate method
        MathOperation power = (a, b) -> {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        };
        System.out.println("Power: " + operate(2, 3, power));

        // 6. Lambda expression using predefined functional interfaces (Runnable)
        Runnable runnable = () -> System.out.println("Hello from a Runnable lambda!");
        new Thread(runnable).start();

        // 7. Lambda expression using forEach with a List
        System.out.println("Using forEach with a List:");
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");
        languages.forEach(language -> System.out.println(language));
    }
}