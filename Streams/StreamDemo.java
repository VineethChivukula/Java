package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Filtering
        System.out.println("Filtering - Even numbers:");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);

        // 2. Mapping
        System.out.println("\nMapping - Squares of numbers:");
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        squares.forEach(System.out::println);

        // 3. Reducing
        System.out.println("\nReducing - Sum of numbers:");
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Sum: " + sum.orElse(0));

        // 4. Sorting
        System.out.println("\nSorting - Sorted numbers in descending order:");
        List<Integer> sortedDesc = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        sortedDesc.forEach(System.out::println);

        // 5. Limit and Skip
        System.out.println("\nLimit and Skip - First 5 numbers:");
        List<Integer> first5 = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        first5.forEach(System.out::println);

        System.out.println("\nSkip - Skipping first 5 numbers:");
        List<Integer> skip5 = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        skip5.forEach(System.out::println);

        // 6. Distinct
        System.out.println("\nDistinct - Distinct elements:");
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5, 5);
        List<Integer> distinctNumbers = duplicateNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        distinctNumbers.forEach(System.out::println);

        // 7. forEach
        System.out.println("\nforEach - Printing with forEach:");
        numbers.stream()
                .forEach(System.out::println);

        // 8. Match
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("\nallMatch - Are all numbers even? " + allEven);

        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch - Are any numbers even? " + anyEven);

        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("noneMatch - Are there no negative numbers? " + noneNegative);

        // 9. Collect
        System.out.println("\nCollect - Collecting into a Set:");
        Set<Integer> numberSet = numbers.stream()
                .collect(Collectors.toSet());
        numberSet.forEach(System.out::println);

        // 10. Summary Statistics
        System.out.println("\nSummary Statistics - Statistics on numbers:");
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}