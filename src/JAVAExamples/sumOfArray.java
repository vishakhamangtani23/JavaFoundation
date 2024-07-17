package JAVAExamples;

import java.util.*;
import java.lang.Math;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        int [] arr = new int [n];
        int sum=0;
        for(int i =0;i<n;i++)
        {
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Sum is"+sum);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime/1000000 +"miliseconds");



    }
}

