package exceptionAndCollection;

import java.util.Scanner;
import java.util.HashMap;

public class StudentGradeByName_04 {
    // creating a private hashMap
    private HashMap<String, Integer> studentGrades;

    // Constructor for studentGrades
    public StudentGradeByName_04() {
        studentGrades = new HashMap<>();
    }

    //Methods to add, remove and display student grades by name

    // Adding a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + ", added with grade " + grade);
    }

    // Removing a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed!");
        }
        else {
            System.out.println("Student " + name + " does not exist!");
        }
    }

    // Displaying student grade
    public void displayStudentGrade (String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + " got " + studentGrades.get(name) + "Grades!");
        }
        else {
            System.out.println("Student " + name + " not found!");
        }
    }

    public static void main(String[] args) {
        StudentGradeByName_04 grades = new StudentGradeByName_04();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("[1] -> Add Student");
            System.out.println("[2] -> Remove Student");
            System.out.println("[3] -> Display Grade");
            System.out.println("[4] -> Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scan.nextInt();
                    grades.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scan.nextLine();
                    grades.removeStudent(name);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    name = scan.nextLine();
                    grades.displayStudentGrade(name);
                    break;

                case 4:
                    System.out.println("You have Exited!");
                    scan.close();
                    return;

                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
