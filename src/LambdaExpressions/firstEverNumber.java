package LambdaExpressions;

import java.util.*;

public class firstEverNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,3,5,6,8,9);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No even number found!")
        );
    }
}
