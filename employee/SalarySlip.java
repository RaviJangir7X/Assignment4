package employee;
import xml.DatabaseManager;
public class SalarySlip {
        public static void printSalary(List<Employee> employee) {
                for (Employee e: employee) {
                    System.out.println("******************");
                    System.out.println("Salary Slip: ");
                    System.out.println("Employee ID: " + e.getEmployeeId());
                    System.out.println("Name: " + e.getFirstName() + " " + e.getLastName() );
                    System.out.println("Email: " + e.getEmail() );
                    System.out.println("Salary: " + e.getBaseSalary());
                    System.out.println("*******************");

                   
                }
        }

    }

