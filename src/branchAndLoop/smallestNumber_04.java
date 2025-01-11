package branchAndLoop;

import java.util.Scanner;

public class smallestNumber_04 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // input three numbers
            System.out.print("Enter 1st number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter 2nd number: ");
            int num2 = scan.nextInt();

            System.out.print("Enter 3rd number: ");
            int num3 = scan.nextInt();

            // Find the smallest number
            int smallest = num1;

            if (num2 < smallest) {
                smallest = num2;
            }
            if (num3 < smallest) {
                smallest = num3;
            }

            System.out.println("The smallest number is: " + smallest);

            scan.close(); // closing the scanner!
        }
    }
