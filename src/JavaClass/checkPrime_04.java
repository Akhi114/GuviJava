package JavaClass;

import java.util.Scanner;

public class checkPrime_04 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("You have given a non-Prime number.");
            }
            else {
                System.out.println("Given value is a Prime number!");
            }
        }
        else{
                    System.out.println("Please enter a integer value.");
        }
    }
}