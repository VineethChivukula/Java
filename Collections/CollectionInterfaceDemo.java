package Collections;

import java.util.*;
import java.util.function.Predicate;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // Creating a List (ArrayList) using the Collection interface
        Collection<String> myCollection = new ArrayList<>();

        // Adding elements to the collection
        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Cherry");

        // Checking if the collection is empty
        boolean isEmpty = myCollection.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);

        // Getting the size of the collection
        int size = myCollection.size();
        System.out.println("Size of the collection: " + size);

        // Checking if an element exists in the collection
        boolean containsBanana = myCollection.contains("Banana");
        System.out.println("Does the collection contain 'Banana'? " + containsBanana);

        // Removing an element from the collection
        boolean removed = myCollection.remove("Cherry");
        System.out.println("Removed 'Cherry' from the collection? " + removed);

        // Iterating through the collection using an iterator
        Iterator<String> iterator = myCollection.iterator();
        System.out.print("Elements in the collection: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Clearing all elements from the collection
        myCollection.clear();
        System.out.println("Cleared the collection.");

        // Rechecking if the collection is empty
        isEmpty = myCollection.isEmpty();
        System.out.println("Is the collection empty now? " + isEmpty);

        // Adding elements back to the collection
        myCollection.add("Grapes");
        myCollection.add("Orange");
        myCollection.add("Banana");

        // Bulk operations using another collection
        Collection<String> otherCollection = new ArrayList<>();
        otherCollection.add("Apple");
        otherCollection.add("Banana");
        otherCollection.add("Cherry");

        // Adding all elements from another collection
        myCollection.addAll(otherCollection);

        System.out.println("Collection after adding all elements from another collection: " + myCollection);

        // Removing all elements that are also in another collection
        myCollection.removeAll(otherCollection);

        System.out.println("Collection after removing elements that are in another collection: " + myCollection);

        // Retaining only the elements that are also in another collection
        myCollection.retainAll(otherCollection);

        System.out.println("Collection after retaining only elements that are in another collection: " + myCollection);

        // Using containsAll to check if all elements from another collection are present
        boolean containsAll = myCollection.containsAll(otherCollection);
        System.out.println("Does the collection contain all elements from the other collection? " + containsAll);

        // Define a Predicate for removeIf
        Predicate<String> startsWithA = str -> str.startsWith("A");

        // Remove elements that satisfy the Predicate
        myCollection.removeIf(startsWithA);

        System.out.println("Collection after removing elements starting with 'A': " + myCollection);
    }
}