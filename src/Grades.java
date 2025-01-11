import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.println("Enter Your Marks: ");
        marks = sc.nextInt();

        if(marks < 0 && marks >100){
            System.out.println("Please enter the valid marks!");
        }
        else if(marks > 90){
            System.out.println("Your got the grade A!");
        }
        else if(marks < 90 && marks > 70){
            System.out.println("Your got the grade B!");
        }
        else if(marks < 70 && marks > 50){
            System.out.println("Your got the grade C!");
        }
        else if(marks < 50 && marks > 35){
            System.out.println("Your got the grade D!");
        }
        else if(marks <= 35){
            System.out.println("Your got the grade E!");
        }
    }
}
