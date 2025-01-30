package streamProblems;

import java.util.*;

public class filterAndSortData {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,4,6,86,45,3,6,58,89,5,3,52);

        List<Integer> data = numbers.stream()
                .filter(n -> n > 50)
                //.sorted((a , b) -> b - a) OR
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("The filtered and sorted data is " + data);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(x -> x * 2).toList();


    }
}
