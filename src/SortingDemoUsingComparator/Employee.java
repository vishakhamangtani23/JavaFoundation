package SortingDemoUsingComparator;

public class Employee {
    private int empCode;
    private String empName;

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

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


}
