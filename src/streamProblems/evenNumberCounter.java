package streamProblems;

import java.util.*;

public class evenNumberCounter {
    public static void main(String[] args) {
       /* ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(8);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5); OR */
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8,4,3,2,3,2,6,7,8,9,9);

        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("The total even numbers in the list are " + evenCount);
    }
}
