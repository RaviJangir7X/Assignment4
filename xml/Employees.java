package xml;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import employee.Employee;
@XmlRootElement
public class Employees {
    private List<Employee> employeesList;

    public List<Employee> getEmployee() {
        return employeesList;
    }

    public void setEmployee(List<Employee> employees) {
        this.employeesList = employees;
    }
}