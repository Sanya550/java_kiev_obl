package com.company.HW5;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Нажмите от 1 до 6:");
        System.out.println("1 - умножение");
        System.out.println("2 - деление");
        System.out.println("3 - сложение");
        System.out.println("4 - вычетание");
        System.out.println("5 - остаток от деления");
        System.out.println("6 - нахождения модуля");
        System.out.println();
       int a = t.nextInt();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        double b = s1.nextDouble();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        double c = s2.nextDouble();

       if(a==1) {
           System.out.println(b * c);
       }
       if(a==2) {
           System.out.println(b / c);
       }
       if(a==3){
                System.out.println(b+c);
        }
       if(a==4){
           System.out.println(b-c);
       }
       if(a==5){
           System.out.println(b%c);
       }
       if(a==6){
           System.out.println("first: "+Math.abs(b));
           System.out.println("second: "+Math.abs(c));
       }
    }



}
