package com.company.HW4;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int b = s2.nextInt();

        System.out.println(Math.sqrt(a*a+b*b));
    }
}
