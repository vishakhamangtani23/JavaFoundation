package SortingDemoUsingComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingEmployee
{
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Vishakha");
        Employee e3 = new Employee(1,"Harshu");
        Employee e2 = new Employee(2,"Harsha");
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Collections.sort(employeeList);

        System.out.println(employeeList);
    }
}
