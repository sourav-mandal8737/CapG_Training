package Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamOperationsTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 15, 25, 35);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado", "grape");

        // 1. Average
        double average = numbers.stream()
                                .mapToInt(i -> i)
                                .average()
                                .orElse(0.0);
        System.out.println("Average: " + average);

        // 2. Uppercase and Lowercase
        System.out.println("Uppercase Words:");
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Lowercase Words:");
        words.stream().map(String::toLowerCase).forEach(System.out::println);

        // 3. Sum of even and odd
        int evenSum = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .mapToInt(i -> i)
                             .sum();
        int oddSum = numbers.stream()
                            .filter(n -> n % 2 != 0)
                            .mapToInt(i -> i)
                            .sum();
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

        // 4. Remove duplicates
        System.out.println("Unique Numbers:");
        numbers.stream().distinct().forEach(System.out::println);

        // 5. Count strings starting with 'a'
        long countA = words.stream()
                           .filter(w -> w.startsWith("a"))
                           .count();
        System.out.println("Words starting with 'a': " + countA);

        // 6. Sort strings ascending and descending
        System.out.println("Ascending Order:");
        words.stream().sorted().forEach(System.out::println);

        System.out.println("Descending Order:");
        words.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

        // 7. Max and Min
        OptionalInt max = numbers.stream()
                                 .mapToInt(i -> i)
                                 .max();
        OptionalInt min = numbers.stream()
                                 .mapToInt(i -> i)
                                 .min();

        System.out.println("Max Value: " + (max.isPresent() ? max.getAsInt() : "None"));
        System.out.println("Min Value: " + (min.isPresent() ? min.getAsInt() : "None"));

        // 8. second smallest and second largest
        List<Integer> sortedList = numbers.stream()
                                          .distinct()
                                          .sorted()
                                          .toList();

        if (sortedList.size() >= 2) {
            int secondSmallest = sortedList.get(1);
            int secondLargest = sortedList.get(sortedList.size() - 2);
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("Not enough unique elements for second smallest/largest.");
        }
    }
}
