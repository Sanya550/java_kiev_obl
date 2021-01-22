package com.company.HW5;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int b = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter third number:");
        int c = s3.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("First number:"+a);
            }if(a==c){
                System.out.println("First:"+a+" and third: "+c );
            }else{
                System.out.println("Third number: "+c);
            }
        }if(a==b){
            if(a==c){
                System.out.println("Three numbers are equal");
            }if(a<c){
                System.out.println("First: "+a+" and Second numbers:"+b);
            }else{
                System.out.println("Third number:"+c);
            }
        }else{
            if(b==c){
                System.out.println("Second:"+b+" and third: "+c);
            }if(b<c){
                System.out.println("Second number:"+b);
            }else{
                System.out.println("Third number:"+c);
            }
        }
    }
}
