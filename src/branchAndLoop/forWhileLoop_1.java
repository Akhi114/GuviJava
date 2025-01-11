package branchAndLoop;

import java.util.Scanner;

public class forWhileLoop_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Your preference : \nFor Loop -> 1 \nWhile Loop -> 2");
        int inp = scan.nextInt(); // Letting the user decide which loop to use.

        if (inp == 1){
            System.out.println("Output using for loop!");
            for (int i = 10; i<= 50; i++){
                System.out.print(i + " ");
            }
        }
        else if (inp == 2) {
            System.out.println("Output using while loop!");
            int i = 10;
            while (i <= 50){
                System.out.print(i + " ");
                i += 1;
            }
        }
        else{
            System.out.println("Please enter a valid input");
        }

        scan.close();
    }
}
