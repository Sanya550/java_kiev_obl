package com.company.HW5;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int b = s2.nextInt();

        if(a%b==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
