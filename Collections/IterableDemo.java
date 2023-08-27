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
        System.out.println("Using for-each loop:");
        for (String fruit : iterable) {
            System.out.println(fruit);
        }
    }
}