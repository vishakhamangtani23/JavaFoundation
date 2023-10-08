package SortingDemoUsingComparable;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int roll_no;
    String fName;

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", fName='" + fName + '\'' +
                ", marks=" + marks +
                '}';
    }

    int marks;

    public int getRoll_no() {
        return roll_no;
    }

    @Override
    public boolean equals(Object o) {
//        this checks if the references are same only return true
        if(this==o) return true;
//        this is for avoiding null pointer exception.
        if((o==null) || getClass() !=o.getClass()) return false;
        Student student = (Student) o;
        return getRoll_no() == student.getRoll_no()  && Objects.equals(getfName(), student.getfName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoll_no(), getfName());
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int roll_no, String fName, int marks) {
        this.roll_no = roll_no;
        this.fName = fName;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.roll_no == o.roll_no ? 0: this.roll_no>o.roll_no ? 1 :-1;
    }

}
