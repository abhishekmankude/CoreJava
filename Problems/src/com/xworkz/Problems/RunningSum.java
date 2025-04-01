package com.xworkz.Problems;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    for (int i = 1; i < arr.length; i++)
    {
            arr[i] += arr[i - 1];
    }
    for(int num:arr)
    {
        System.out.print(num+",");
    }


    }

}
