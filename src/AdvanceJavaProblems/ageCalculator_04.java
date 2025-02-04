package AdvanceJavaProblems;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalculator_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthdate! (yyyy-mm-dd): ");
        String birthDateInput = sc.nextLine();

        // Parse the input date!
        LocalDate birthDate = LocalDate.parse(birthDateInput);
        LocalDate currentDate = LocalDate.now();

        // Calculating the age!
        Period age = Period.between(birthDate, currentDate);

        // Result!
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}
