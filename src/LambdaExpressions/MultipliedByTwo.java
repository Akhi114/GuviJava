package LambdaExpressions;

import java.util.*;

public class MultipliedByTwo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n * 2);

        System.out.println("Sum of numbers multiplied by 2 are: " + sum[0]);
    }
}
