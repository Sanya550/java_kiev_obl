package com.company.HW4;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int b = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter third number: ");
        int c = s3.nextInt();

        System.out.println("Result is: "+Math.pow(a,b));

    }
}
