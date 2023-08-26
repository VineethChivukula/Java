package Strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        // 1. Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // 2. Appending and Modifying Strings
        stringBuffer.append("Java"); // Appending a string
        stringBuffer.insert(7, " World"); // Inserting a string at a specific index
        stringBuffer.setCharAt(5, '!'); // Changing a character at a specific index
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // 3. Length and Capacity
        int length = stringBuffer.length(); // Length of the string
        int capacity = stringBuffer.capacity(); // Capacity of the underlying buffer
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);

        // 4. Deleting and Reversing
        stringBuffer.delete(0, 7); // Deleting a portion of the string
        stringBuffer.reverse(); // Reversing the string
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // 5. Converting to String
        String result = stringBuffer.toString(); // Converting StringBuffer to String
        System.out.println("Resulting String: " + result);
    }
}