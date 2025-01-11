package JavaClass;

import java.util.Scanner;

public class armstrongNumber_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int realNum = num;

        int totalDigits = 0;
        while (num > 0){
            num /= 10;
            totalDigits++;
        }

        num = realNum;

        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, totalDigits);
            num /= 10;
        }
        if (sum == realNum){
            System.out.println(realNum + " is an Armstrong number");
        }
        else{
            System.out.println(realNum + " is not an Armstrong number");
        }

        scanner.close();
    }
}
