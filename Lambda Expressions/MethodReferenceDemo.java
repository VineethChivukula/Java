import java.util.Arrays;

public class MethodReferenceDemo {
    // A method for printing an array
    public static void printArray(String[] arr) {
        for (String item : arr) {
            System.out.println(item);
        }
        System.out.println();
    }

    // A static method for comparing colors
    public static int compareColors(String color1, String color2) {
        return color1.compareTo(color2);
    }

    public static void main(String[] args) {
        // An array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};

        // Using a method reference to sort the array
        Arrays.sort(names, String::compareTo);
        System.out.println("Sorted Names (Using Method Reference):");
        printArray(names);

        // Using a static method reference
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        Arrays.sort(colors, MethodReferenceDemo::compareColors);
        System.out.println("Sorted Colors (Using Static Method Reference):");
        printArray(colors);
    }
}