package SortingDemoUsingComparator;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getEmpCode(), o2.getEmpCode());
    }
}
