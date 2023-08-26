import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) throws IOException {
        // Using BufferedReader for input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = br.readLine(); // Read a line of text input

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // Parse integer input

        // Using Scanner for input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite color: ");
        String color = scanner.nextLine(); // Read a line of text input

        System.out.println("Enter a floating-point number: ");
        double floatValue = scanner.nextDouble(); // Read a double input

        // Using System.out.print(), System.out.println(), System.out.printf() for output
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("! You are " + age + " years old.");
        System.out.println("Your favorite color is: " + color);
        System.out.printf("The floating-point number is: %.2f%n", floatValue);

        // Closing resources
        br.close();
        scanner.close();
    }
}
