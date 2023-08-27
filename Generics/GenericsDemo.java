package Generics;

import java.util.ArrayList;
import java.util.List;

// Generic class with a type parameter T
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Generic method that accepts a list of any type
    public static <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Creating a generic box with an Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Value: " + intBox.getValue());

        // Creating a generic box with a String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());

        // Creating a list of integers
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Creating a list of strings
        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        strList.add("Three");

        // Using the generic printList method to print lists
        System.out.print("Integer List: ");
        Box.printList(intList);
        System.out.print("String List: ");
        Box.printList(strList);

        // Wildcard (?) with upper bound (Number)
        List<? extends Number> numbers = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        numbers = integerList; // OK
        numbers = doubleList;  // OK

        // Using numbers (List<? extends Number>)
        System.out.print("Numbers List: ");
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Wildcard (?) with lower bound (Integer)
        List<? super Integer> integerSuperList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        integerSuperList = numberList; // OK
        integerSuperList = objectList; // OK

        // Using integerSuperList (List<? super Integer>)
        integerSuperList.add(10);
        integerSuperList.add(20);
        System.out.print("Integer Super List: ");
        Box.printList(integerSuperList);
    }
}