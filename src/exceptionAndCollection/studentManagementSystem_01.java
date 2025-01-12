package exceptionAndCollection;

import java.util.Scanner;

public class studentManagementSystem_01 {

    public static void main(String[] args) {
        int roll_no, age;
        String name, course;
        Scanner scan = new Scanner(System.in);

        // Taking Student details from the user
        System.out.println("Enter roll no.- ");
        roll_no = scan.nextInt();
        scan.nextLine();
        try{
            // Entering student name:
            System.out.println("Enter student's name: ");
            name = scan.nextLine();
            validateName(name);

            // Entering age:
            System.out.println("Enter student's age: ");
            age = scan.nextInt();
            validateAge(age);

            // Entering course:
            System.out.println("Enter course: ");
            course = scan.nextLine();

            // Adding student details to the class!
            Student s = new Student(roll_no, name, age, course);
            s.displayStudents();
        } catch (AgeNotWithinRangeException|NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("You're not eligible for the school!");
        }
    }
    public static void validateName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Student name contains invalid characters!");
        }
    }
}

class Student{

    int rollNo, age;
    String name, course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudents(){
        System.out.println("Roll no.: " + rollNo + "\nName: " + name + "\nAge: " + age + "\nCourse: " + course);
    }
}

class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException(String message) {
        super(message); // Call the parent constructor exception message
    }
}

class NameNotValidException extends Exception {

    public NameNotValidException(String message){
        super(message);
    }
}
