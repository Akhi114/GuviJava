package StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commaSeparator {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "Prashant", "This", "is", "What", "it", "is");

        String collect = words.stream().collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
