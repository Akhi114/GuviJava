package StreamProblems;

import java.util.*;

public class maxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8,4,3,2,3,2,6,7,8,9,9);
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);

        Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
        maxNum.ifPresent(max -> System.out.println("The max number is " + max));

        System.out.println("The maximum number is " + maxNumber);
    }
}
