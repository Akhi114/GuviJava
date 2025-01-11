package JavaClass;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciSequence_03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        ArrayList<Integer> sequenceList = new ArrayList<>();

        System.out.println("Enter the value for fibonacci sequence: ");
        int n = sc.nextInt();

        System.out.println("The Fibonacci Sequence of " + n + " number is: ");

        if (n>=1){
            sequenceList.add(a);
            //System.out.println(a + " ");
        }
        if (n>=2){
            sequenceList.add(b);
            //System.out.println(b + " ");
        }

        for (int i = 3; i<=n; i++){
            int nextInt = a+b;
            sequenceList.add(nextInt);
            a = b;
            b = nextInt;
        }
        for (int i = 0; i<sequenceList.size(); i++) {

            System.out.print(sequenceList.get(i));
            if (i < sequenceList.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
