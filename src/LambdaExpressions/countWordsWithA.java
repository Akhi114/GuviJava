package LambdaExpressions;

import java.util.*;

public class countWordsWithA {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Arashant", "Gamepad", "Speaker", "Phone", "Keyboard");

        final int[] count = {0};

        words.forEach(word -> {
            if(word.toLowerCase().startsWith("a")) {
                count[0]++;
            }
        });
        System.out.println("Number of words starting with 'A': " + count[0]);
    }
}
