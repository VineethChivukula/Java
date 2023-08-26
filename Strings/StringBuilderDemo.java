package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1. Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello, ");

        // 2. Appending and Modifying Strings
        stringBuilder.append("Java"); // Appending a string
        stringBuilder.insert(7, " World"); // Inserting a string at a specific index
        stringBuilder.setCharAt(5, '!'); // Changing a character at a specific index
        System.out.println("Modified StringBuilder: " + stringBuilder);

        // 3. Length and Capacity
        int length = stringBuilder.length(); // Length of the string
        int capacity = stringBuilder.capacity(); // Capacity of the underlying buffer
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);

        // 4. Deleting and Reversing
        stringBuilder.delete(0, 7); // Deleting a portion of the string
        stringBuilder.reverse(); // Reversing the string
        System.out.println("Reversed StringBuilder: " + stringBuilder);

        // 5. Converting to String
        String result = stringBuilder.toString(); // Converting StringBuilder to String
        System.out.println("Resulting String: " + result);
    }
}