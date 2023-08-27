package Collections;

import java.util.*;

public class IterableDemo {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Create an Iterable object from the list
        Iterable<String> iterable = myList;

        // Obtain an Iterator from the Iterable
        Iterator<String> iterator = iterable.iterator();

        // Iterate through the elements using the Iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using the for-each loop with Iterable
        System.out.println("\nUsing for-each loop:");
        for (String fruit : iterable) {
            System.out.println(fruit);
        }

        // Using the forEach method introduced in Java 8
        System.out.println("\nUsing forEach method (Java 8+):");
        iterable.forEach(fruit -> System.out.println(fruit));
    }
}