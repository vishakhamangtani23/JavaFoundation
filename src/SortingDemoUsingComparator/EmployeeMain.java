package SortingDemoUsingComparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Vishakha");
        Employee e3 = new Employee(1, "Harshu");
        Employee e2 = new Employee(2, "Harsha");

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
//Proper implementation by Making a Class And giving uska object
        Collections.sort(employeeList, new SortByName());
        Collections.sort(employeeList, new SortById());
//but this is very tedious
//        Step 2:-
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getEmpCode(),o2.getEmpCode());
            }
        });
        Collections.sort(employeeList,(o1,o2) -> o1.getEmpName().compareTo(o2.getEmpName()));


        System.out.println(employeeList);

    }
}
