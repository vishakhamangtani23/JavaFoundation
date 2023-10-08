package SortingDemoUsingComparable;

public class Employee implements Comparable<Employee> {
    private int empCode;
    private String empName;

    @Override
    public String toString() {
        return "Employee{" +
                "empCode=" + empCode +
                ", empName='" + empName + '\'' +
                '}';
    }

    public Employee(int empCode, String empName) {
        this.empCode = empCode;
        this.empName = empName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empName.compareTo(o.empName);
    }
}
