package Day2;

import java.awt.*;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails - one to one structure - one employee one email
        EmployeData.readlAll().
                map(Employee::getEmployeEmail).
                forEach(System.out::println);
        System.out.println("------------");
        //print All phone numbers
        EmployeData.readlAll().
                map(Employee::getEmpPhoneNumbers).// Stream<List<Stream>>
                forEach(System.out::println);

        System.out.println("------------");
        EmployeData.readlAll().
                flatMap(employee -> employee.getEmpPhoneNumbers().stream()).
                forEach(System.out::println);

        System.out.println("------------");
        EmployeData.readlAll().
                map(Employee::getEmpPhoneNumbers).
                flatMap(List::stream).
                forEach(System.out::println);
    }


}
