package SQLConnectivityToJava;

import java.sql.*;

public class queryInsertUsingJDBC {
    public static void main(String[] args) {
        String JDBCUrl = "jdbc:mysql://localhost:3306/CompanyDB";
        String userName = "root";
        String Password = "Passwd7";

        String insertQuery = "INSERT INTO Employee(EmpCode, EmpName, EmpAge, EmpSalary) VALUES(?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBCUrl, userName, Password);
            System.out.println("Connected to the database successfully!");

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            Object[][] employees = {
                    {101, "Jenny", 25, 10000},
                    {102, "Jacky", 30, 20000},
                    {103, "Joe", 20, 40000},
                    {104, "John", 40, 80000},
                    {105, "Shameer", 25, 90000}
            };

            // Inserting each Employee record
            for (Object[] emp: employees) {
                preparedStatement.setInt(1, (Integer) emp[0]);
                preparedStatement.setString(2, (String) emp[1]);
                preparedStatement.setInt(3, (Integer) emp[2]);
                preparedStatement.setDouble(4, (Double) ((Number) emp[3]).doubleValue());

                preparedStatement.executeUpdate();
                System.out.println("Inserted: " + emp[1]);
            }

            // Close resources
            preparedStatement.close();
            connection.close();
            System.out.println("Data inserted and connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occured.");
            e.printStackTrace();
        }
    }
}
