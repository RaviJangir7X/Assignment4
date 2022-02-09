package employee;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
    private static int maxEmployeeId = 0;

    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int baseSalary;

    public Employee() {
        System.out.println("Default Constructor");
        setEmployeeId(++maxEmployeeId);
    }
    public Employee(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(firstName+lastName+"@sevenx.io");

    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
      if(email == null) {
            setEmail(firstName + "." + lastName + "@sevenx.io");
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }
}