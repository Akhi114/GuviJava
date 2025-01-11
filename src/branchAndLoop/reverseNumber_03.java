package branchAndLoop;

import java.util.Scanner;

public class reverseNumber_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any digit:");
        int inp = scan.nextInt();
        int reversedNum = 0;
        while ( inp > 0) {
            int digit = inp % 10; // take out the last digit!
            reversedNum = (reversedNum * 10) + digit; // this will keep adding the reverse number!
            inp = inp / 10; // This will remove the last digit!
        }

        System.out.println("Reversed Number: " + reversedNum);
        scan.close();
    }
}
