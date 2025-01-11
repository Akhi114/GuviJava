package branchAndLoop;

import java.util.Scanner;

public class negativePositiveCheck_02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a digit: ");
        int inp = scan.nextInt();

        if (inp >= 0) {
            System.out.println("Entered digit is Positive! \n" + inp);
        }
        else {
            System.out.println("Entered digit is Negative! \n" + inp);
        }

        scan.close();
    }
}
