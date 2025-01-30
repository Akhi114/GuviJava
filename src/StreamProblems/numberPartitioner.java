package StreamProblems;

import java.util.*;
import java.util.stream.Collectors;

public class numberPartitioner {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> list1 = integers.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> list2 = integers.stream().filter(x -> x % 2 != 0).toList();

        System.out.println(list1);
        System.out.println(list2);

        // OR

        Map<Boolean, List<Integer>> partitionedNumbers = integers.stream().collect(Collectors.partitioningBy(n -> n % 2 != 0));

        System.out.println(partitionedNumbers.get(true));
        System.out.println(partitionedNumbers.get(false));
    }
}
