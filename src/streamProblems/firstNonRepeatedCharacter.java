package streamProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class firstNonRepeatedCharacter {
    public static void main(String[] args) {
        // Sample input string.
        String input = "Prashant";

        Character result = input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
