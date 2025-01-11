package javaOOPs;

public class Employee extends person{

    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public Employee(String name, int employeeID, double salary) {
        super(name);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        super.displayPerson();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String [] args) {

        //creating an object for the employee
        Employee emp = new Employee("Prashant", 21, 1012, 90000);

        //displaying the employee info
        emp.displayEmployeeInfo();
    }
}
