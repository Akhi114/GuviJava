package StreamProblems;

import java.util.*;
import java.util.stream.Stream;

public class squaringElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,5,6,7,78,5,4);

        List<Integer> squaredNum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .distinct()
                .peek(System.out::println)
                .map(x -> x * 2)
                .toList();

        Integer[] array = {1,3,5,67,7,8,9};
        Arrays.stream(array).peek(System.out::print);

        Stream.of("number", "number1", "number2").peek(System.out::print);

        Stream.iterate(0, n -> n +1).skip(1).limit(26).toList().stream().peek(System.out::print);

        Stream.generate(() -> "hello").limit(5);

        System.out.println("The square of digits in the list are " + squaredNum);
    }
}
