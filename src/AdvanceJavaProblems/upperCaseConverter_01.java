package AdvanceJavaProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class upperCaseConverter_01 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        List<String> upperCased = names.map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("The list of names after being uppercased: " + upperCased);
    }
}
