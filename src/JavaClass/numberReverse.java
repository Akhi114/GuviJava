package JavaClass;

import java.util.Scanner;

public class numberReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to reverse: ");
        int num = sc.nextInt();

        int reverseNum = reverse(num);
        System.out.println("Reversed number: " + reverseNum);
    }

    public static int reverse(int number){
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }
}
