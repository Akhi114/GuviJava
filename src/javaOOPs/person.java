package javaOOPs;

import java.util.Scanner;

public class person {

    int age;
    String name;

    //Constructor for user age input
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Constructor with default age
    public person(String name) {
        this.name = name;
        this.age = 18;
    }

    //function for displaying the input
    public void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Taking input from the user!
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Would you like to enter your age: Y/N?");
        String ans = scan.next();

        //Creating an object of person class
        person p1;
        if (ans.equals("Y")) {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();
            p1 = new person(name, age);
        }
        else {
            p1 = new person(name);
        }

        p1.displayPerson();
        scan.close();
    }
}
