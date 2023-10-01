package SetInterfaceDemo;

import java.util.Objects;

public class Employee {
    int employeeCode;
    String fName;
    String lName;

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Employee(int employeeCode, String fName, String lName) {
        this.employeeCode = employeeCode;
        this.fName = fName;
        this.lName = lName;
    }
//  agar do objects equal hai toh unka hashcode b same hona chhye
//    agar 2 objects ka hashcode same hai , it is not necessary ki vo dono equal ho


    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return Objects.equals(this.employeeCode , employee.employeeCode) &&  (this.fName.equals(employee.fName) && this.lName.equals(employee.lName) );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeCode(), getfName(), getlName());
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}'+'\n';
    }
}
