package SortingDemoUsingComparable;

import java.util.*;

public class CompanyDemo {
    public static void main(String[] args) {
        Company c1 = new Company(1,"Zebra",2);
        Company c4 = new Company(4,"EY",2);
        Company c2 = new Company(2,"KPMG",3);
        Company c3 = new Company(3,"MICROSOFT",4);


        List<Company> companyList = new ArrayList<>();
        companyList.add(c1);
        companyList.add(c4);
        companyList.add(new Company(5,"Google",3));
        companyList.add(c2);
        companyList.add(c3);

        System.out.println(companyList);
        Collections.sort(companyList);
        System.out.println(companyList);

    }

}
