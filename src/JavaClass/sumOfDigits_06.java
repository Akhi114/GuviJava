package JavaClass;

import java.util.Scanner;

public class sumOfDigits_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int sumOfDigits = 0;

        while (value > 0){
            sumOfDigits += value % 10;
            value /= 10;
        }
        System.out.println("The sum of digits is: " + sumOfDigits);
    }
}
