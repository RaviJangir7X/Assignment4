package xml;

import employee.Employee;
import java.sql.*;
import java.util.*;

public class DatabaseManager {
    public static final String username = "root";
    public static final String password = "";
    public static final String url = "jdbc:mysql://localhost:3306/?user=root";

    public static void insertingInDatabase(List<Employee> employeeList1) {
        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);
            Statement statement = con.createStatement();
            for (Employee emp : employeeList1) {
                statement.execute("INSERT INTO `employees`.`employee` (`employeeId`, `firstName`, `lastName`, `email`, `baseSalary`) VALUES ('" +
                        emp.getEmployeeId() + "', '" + emp.getFirstName() + "', '" + emp.getLastName() + "', '" + emp.getEmail() +
                        "', '" + emp.getBaseSalary() + "');");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Employee> fetchingFromDatabase() throws SQLException{
        Connection con  = DriverManager.getConnection(
                url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM employees.employee;");
        List<Employee> employee = new ArrayList<>();

        while(rs.next()) {
            Employee e = new Employee();
            e.setEmployeeId(rs.getInt(1));
            e.setFirstName(rs.getString(2));
            e.setLastName(rs.getString(3));
            e.setEmail(rs.getString(4));
            e.setBaseSalary(rs.getInt(5));

            employee.add(e);
        }
        return employee;
    }
}
