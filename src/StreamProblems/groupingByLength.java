package StreamProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class groupingByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Prashant", "This", "is", "What", "it", "is");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((length, strings) ->
                        System.out.println("Length " + length + ": " + strings));
    }
}
