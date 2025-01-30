package LambdaExpressions;

import java.util.*;

public class lambdaSort {
    public static void main(String [] args) {
        List<String> items = Arrays.asList("apple", "ball", "call tyoe", "fo");

        items.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        System.out.println(items);
    }
}
