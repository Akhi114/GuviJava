package LambdaExpressions;

import java.util.*;
import java.util.stream.Collectors;

public class wordFrequencyCounter {

    public static void main(String[] args) {
    // Example input string
        String input = "This is a sample string. This string is for counting word frequency. Word frequency matters.";

        // Normalize the string: convert to lowercase and remove punctuation
        String normalizedInput = input.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        // Split the string into words
        List<String> words = Arrays.asList(normalizedInput.split("\\s+"));

        // Use streams to count the frequency of each word
        Map<String, Long> wordFrequency = words.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Print the word frequencies
        wordFrequency.forEach((word, frequency) ->
                System.out.println("Word: '" + word + "', Frequency: " + frequency));
        }
    }
