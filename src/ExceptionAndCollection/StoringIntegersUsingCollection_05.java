package ExceptionAndCollection;

import java.util.Stack;
import java.util.Scanner;

public class StoringIntegersUsingCollection_05 {
    private Stack<Integer> stack;

    public StoringIntegersUsingCollection_05() {
        stack = new Stack<>();
    }

    // Methods to push, pop and check an element in the stack

    // Push method
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack!");
    }

    // Pop method
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty! Cannot pop elements!");
        } else {
            int removedElement = stack.pop();
            System.out.println("Popped " + removedElement + " from the stack!");
        }
    }

    // Check empty stack method
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty!");
        } else {
            System.out.println("The stack is not empty!");
        }
    }

    public static void main(String[] args) {
        StoringIntegersUsingCollection_05 operations = new StoringIntegersUsingCollection_05();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("[1] -> Push element onto the stack");
        System.out.println("[2] -> Pop element from the stack");
        System.out.println("[3] -> Check if the stack is empty");
        System.out.println("[4] -> Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.print("Enter the element to push: ");
                    int element = scan.nextInt();
                    operations.pushElement(element);
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    operations.popElement();
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    operations.checkIfEmpty();
                    break;
                case 4:
                    System.out.println("-------------------------------");
                    System.out.println("You have Exited!");
                    scan.close();
                    return;
                default:
                    System.out.println("-------------------------------");
                    System.out.println("Invalid choice! Please try again!");
            }
        }
    }
}
