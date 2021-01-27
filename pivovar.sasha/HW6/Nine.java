package com.company.HW6;

import java.util.Scanner;

import static java.lang.System.exit;

public class Nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();

String b = Integer.toBinaryString(a);
        System.out.println(b);

        Scanner t = new Scanner(System.in);
        System.out.println("Enter which bit should be changed: ");
        int i = t.nextInt();

int c = (int) (a - Math.pow(2,i));
if(c<0){
    System.out.println("It is impossible");
    exit(1);
}
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c);
    }
}
