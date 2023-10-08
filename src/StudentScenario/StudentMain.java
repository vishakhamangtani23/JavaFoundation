package StudentScenario;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Vishakha",33);
        Student s2 = new Student(2,"Vishakha",33);
        Student s3 = new Student(1,"Vishakha",33);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        System.out.println(studentSet.toString());

    }
}
