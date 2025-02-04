package AdvanceJavaProblems;

import java.util.*;
import java.util.stream.Collectors;

public class emptyStringsChecker_02 {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyList = listString.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());

        System.out.println("This is the list having empty strings: " + listString);
        System.out.println("This is the list after removing the empty strings: " + nonEmptyList);
    }
}
