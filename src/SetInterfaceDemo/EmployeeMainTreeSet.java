package SetInterfaceDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMainTreeSet {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Vishakha", "Mangtani");
        Employee e2 = new Employee(2, "Khwaish", "Mangtani");
        Employee e3 = new Employee(3, "Kiran", "Mangtani");
        Employee e4 = new Employee(4, "Pikachu", "Mangtani");

        //in this scenario we are expecting that emp4 should not be added bcoz it has same data as that of emp3 but it will add because the reference emp4 is different from emp3
        Employee e5 = new Employee(4, "Pikachu", "Mangtani");

//        in this scenario,the reference emp1 will be checked by equals method of object class, since the reference is being repeated fourth time, it will not allow to add emp1  reference again in the set irrespective of the contents of the object

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
        System.out.println(employeeSet);
    }
}
