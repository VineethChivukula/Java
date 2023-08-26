import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Using throw to manually throw an exception
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            // Using throws to declare potential exceptions
            FileReader fileReader = new FileReader("nonexistentfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Read from file: " + line);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // Handling multiple exceptions in a single catch block
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Using Throwable to catch all exceptions
        try {
            int[] array = new int[5];
            array[10] = 10; // ArrayIndexOutOfBoundsException
        } catch (Throwable t) {
            System.out.println("Caught Throwable: " + t.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }

    // Custom Exception class
    static class MyException extends Exception {
        MyException(String message) {
            super(message);
        }
    }

    // Method that throws a custom exception
    static int divide(int a, int b) throws ArithmeticException, MyException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        } else if (a == 10) {
            throw new MyException("Custom exception from divide()");
        }
        return a / b;
    }
}