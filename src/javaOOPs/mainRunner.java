package javaOOPs;

import java.util.Scanner;

public class mainRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        product [] products = new product[5];

        //taking the product info from the user
        for (int i=0; i<products.length; i++) {
            System.out.println("Enter product " + (i+1) + " info: ");
            System.out.println("Enter Product ID: ");
            int pID = scan.nextInt();
            System.out.println("Enter Product's price: ");
            int pPrice = scan.nextInt();
            System.out.println("Enter Product's quantity: ");
            int pQuantity = scan.nextInt();

            products[i] = new product(pID, pPrice, pQuantity);
        }
        scan.close();// closing the scanner

        //Displaying the product details
        for (product product: products) {
            product.displayInfo();
        }

        int maxPrice = 0;
        int maxPricePID = 0;

        //loop for finding the product with the highest price
        for (product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePID = product.pid;
            }
        }

        System.out.println("\n\nThe product with highest price is " + maxPricePID);
        System.out.println("Price: " + maxPrice);

        //using totalAmount method given below to get the total amount of all products
        int totalAmount  = totalAmount(products);
        System.out.println("\n\nTotal amount spent on Products: " + totalAmount);
    }

    public static int totalAmount(product[] products) {
        int total = 0;

        for (product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
}
