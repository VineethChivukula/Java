package Strings;

public class StringsDemo {
    public static void main(String[] args) {
        // 1. Creating Strings
        String str1 = "Hello, World!"; // Using string literal
        String str2 = new String("Java"); // Using the String constructor

        // 2. String Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // 3. Concatenation
        String fullName = "John" + " " + "Doe";
        System.out.println("Full Name: " + fullName);

        // 4. String Methods
        String lowerCase = str1.toLowerCase();
        String upperCase = str1.toUpperCase();
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Uppercase: " + upperCase);

        // 5. Substring
        String substring = str1.substring(0, 5); // Get the substring from index 0 to 4
        System.out.println("Substring: " + substring);

        // 6. Comparing Strings
        boolean isEqual = str1.equals(str2); // Using .equals()
        boolean isIgnoreCaseEqual = str1.equalsIgnoreCase("HELLO, WORLD!"); // Ignoring case
        System.out.println("str1 equals str2: " + isEqual);
        System.out.println("str1 equals (ignoring case): " + isIgnoreCaseEqual);

        // 7. Searching for Substrings
        boolean contains = str1.contains("World");
        int indexOfWorld = str1.indexOf("World"); // Index of "World" in str1
        System.out.println("Contains 'World': " + contains);
        System.out.println("Index of 'World': " + indexOfWorld);

        // 8. Replacing Substrings
        String replacedString = str1.replace("World", "Java");
        System.out.println("Replaced String: " + replacedString);

        // 9. Splitting Strings
        String csvData = "John,Doe,30";
        String[] dataParts = csvData.split(",");
        System.out.println("CSV Data Parts:");
        for (String part : dataParts) {
            System.out.println(part);
        }

        // 10. Trimming
        String withWhitespace = "   Trim Me   ";
        String trimmed = withWhitespace.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");
    }
}