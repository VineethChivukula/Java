import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        // If-else statement
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is non-positive.");
        }
        else {
            System.out.println("Number is Zero.");
        }

        // Switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Satisfactory.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        int x = 1;
        do {
            System.out.println("x: " + x);
            x++;
        } while (x <= 5);

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // For-each loop (Enhanced for loop)
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Break and continue statements
        System.out.println("Counting to 10, skipping 5:");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue; // Skip iteration when j is 5
            }
            System.out.println(j);
        }

        // Nested loops
        System.out.println("Multiplication table:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println(); // Move to the next row
        }

        // Break out of a loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number (0 to exit): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break; // Exit the loop if input is 0
            }
            System.out.println("You entered: " + input);
        }
        scanner.close();
    }
}