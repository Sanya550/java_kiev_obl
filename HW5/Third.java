package com.company.HW5;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int b = s2.nextInt();

        int t1 = Math.abs(a-10);
        int t2 = Math.abs(b-10);

        if(t1<t2){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

}
