package LambdaExpressions;

import java.util.*;

public class removingDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,2,5,5,2,1,6,4,3);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        List<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);

        sortedNumbers.sort((a, b) -> b - a);

        System.out.println("List without duplicates: " + sortedNumbers);
    }
}
