package streamProblems;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateRemover {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,5,6,7,8,9,6,3,5,7,9,0,6,4,3,2,5,6,7,4,3);

        List<Integer> uniqueList = list.stream()
                .distinct()
                .sorted().toList();

        System.out.println(uniqueList);
    }
}
