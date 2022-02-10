package xml;

import employee.Display;
import employee.Employee;
import java.util.List;
import java.sql.SQLException;
import java.sql.*;
public class EmployeeManagement {
    public static void main(String[] args) throws SQLException {


        String path = "C:\\assignment5\\src\\xml\\employee.xml";

        List<Employee> employee = EmployeeXmlParser.parsing(path);
        DatabaseManager.insertingInDatabase(employee);
        List<Employee> employeeList = DatabaseManager.fetchingFromDatabase();

        SalarySlip.printSalary(employeeList);
    }
}
