package AdvanceJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class giftingStudentsWithAPrefix_03 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Ankit", "Rahul", "Aman", "Vikram", "Arjun", "Bhavya", "Aarti", "Mohit", "Arya", "Shreya");

        List<String> giftSupplied = students.stream()
                .filter(names -> names.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Gifts are distributed between \n" + giftSupplied);

    }
}
