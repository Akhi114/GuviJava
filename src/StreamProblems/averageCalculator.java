package StreamProblems;

import java.util.*;

public class averageCalculator {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,46,6,7,8,9,9,7,6,5,4,3,3,3,4,5,32,2,2,4,5,7,7,6,43,6,8,8,9,5,5);

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .peek(n -> System.out.print(n + " "))
                .average();

        System.out.println("\nThe average of all the numbers are " + average);
    }
}
