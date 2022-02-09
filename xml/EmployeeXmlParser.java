package xml;

import employee.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class EmployeeXmlParser {

    //public static void main(String[] args) {
    public static List<Employee> parsing(String path){
        File file = new File(path);

        JAXBContext jaxbContext;
        try {

            jaxbContext = JAXBContext.newInstance(Employees.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Employees employees = (Employees)jaxbUnmarshaller.unmarshal(file);
            List<Employee> employeesList = employees.getEmployee();

            // System.out.println(employees);

            return employeesList;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
