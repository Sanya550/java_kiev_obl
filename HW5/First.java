package com.company.HW5;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        int b = a%2;
        if(b==0){
            System.out.println("This number divisible by 2");
        }else{
            System.out.println("This number not -5divisible by 2");
        }
    }
}
