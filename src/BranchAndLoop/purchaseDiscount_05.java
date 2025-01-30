package BranchAndLoop;

import java.util.Scanner;

public class purchaseDiscount_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the purchase amount: ");
        int MRP = scan.nextInt();

        if (MRP > 0 && MRP < 500) {
            System.out.println("No discount available!\nYour payable amount is \n\n" + MRP);
        }
        else if (MRP > 500 && MRP < 1000) {
            System.out.println("10% discount is applied!");
            int discountPrice = MRP - MRP*10/100;
            System.out.println("Your payable amount is \n\n" + discountPrice);
        }
        else {
            System.out.println("20% discount is applied!");
            int discountPrice = MRP - MRP*10/100;
            System.out.println("Your payable amount is \n\n" + discountPrice);
        }
    }
}
