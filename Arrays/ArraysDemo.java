package Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // 1. Declaring and Initializing Arrays
        int[] intArray = { 1, 2, 3, 4, 5 }; // Declaring and initializing an integer array
        String[] stringArray = new String[3]; // Declaring and creating a string array with a specified size

        // Initializing elements in the string array
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "!";

        // 2. Accessing Array Elements
        System.out.println("First element of intArray: " + intArray[0]);
        System.out.println("Second element of stringArray: " + stringArray[1]);

        // 3. Array Length
        int length = intArray.length;
        System.out.println("Length of intArray: " + length);

        // 4. Iterating through Arrays
        System.out.print("intArray elements: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.print("stringArray elements: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 5. Multidimensional Arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Element at matrix[1][2]: " + matrix[1][2]);

        // 6. Arrays of Objects
        // Arrays can also hold objects, like Strings
        // Creating an array of strings
        String[] cities = {"New York", "London", "Paris"};
        System.out.println("City at index 1: " + cities[1]);
    }
}