package SortingDemoUsingComparable;


import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(12);
        integerList.add(77);
        integerList.add(44);
        integerList.add(33);

        System.out.println("Before Sorting");
        System.out.println(integerList);

        Collections.sort(integerList);

        System.out.println("After Sorting");
        System.out.println(integerList);
        Student sx = new Student(-1000000000,"Vishakha",33);
        Student s1 = new Student(1,"Vishakha",33);
        Student s2 = new Student(2,"Vishakha",33);
        Student s3 = new Student(3,"Vishakha",33);

        List<Student> studentList = new ArrayList<>();
        studentList.add(sx);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        Collections.sort(studentList);
        System.out.println(studentList.toString());


    }
}
