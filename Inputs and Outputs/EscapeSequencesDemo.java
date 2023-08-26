public class EscapeSequencesDemo {
    public static void main(String[] args) {
        // Using escape sequences within string literals
        String singleQuote = "She said, \"It's raining.\""; // Using \"
        String backslash = "This is a backslash: \\";       // Using \\
        String newLine = "Line 1\nLine 2";                  // Using \n
        String tab = "Column 1\tColumn 2";                  // Using \t
        String unicode = "Unicode smiley: \u263A";          // Using \\u for Unicode

        // Printing the strings
        System.out.println(singleQuote);
        System.out.println(backslash);
        System.out.println(newLine);
        System.out.println(tab);
        System.out.println(unicode);
    }
}