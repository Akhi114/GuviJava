package exceptionAndCollection;

import java.util.Scanner;

public class Voter_02 {
    int voterID, age;
    String name;

    public Voter_02(int voterID, String name, int age) {
        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }

    public void displayVoterDetail() {
        System.out.println("\n\nVoter's ID: " + voterID + "\nName: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voterId, age;
        String name;

        try {
            System.out.println("Enter your voter ID: ");
            voterId = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter voter name: ");
            name = scan.nextLine();

            System.out.println("Enter voter age: ");
            age = scan.nextInt();
            validateAge(age);

            Voter_02 v = new Voter_02(voterId, name, age);
            v.displayVoterDetail();

        }catch (NotEligible e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws NotEligible {
        if (age < 18) {
            throw new NotEligible("You're Not eligible for voting!");
        }
    }
}

class NotEligible extends Exception {
    public NotEligible (String message) {
        super(message);
    }
}
