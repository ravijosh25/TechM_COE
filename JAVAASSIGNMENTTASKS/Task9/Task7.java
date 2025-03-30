// 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 45, 12, 67, 34, 89, 2, 56);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
