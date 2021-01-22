package com.company.HW4;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner t1 =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int q = t1.nextInt();

        Scanner t2 =new Scanner(System.in);
        System.out.println("Enter second number: ");
        int w = t2.nextInt();

        Scanner t3 =new Scanner(System.in);
        System.out.println("Enter third number: ");
        int e = t3.nextInt();

        if(q>w){
            if(q>e){
                System.out.println("The biggest number is: "+q);
            }else{
                System.out.println("The biggest number is: "+e);
            }
        }else{
            if(w>e){
                System.out.println("The biggest number is: "+w);
            }else{
                System.out.println("The biggest number is: "+e);
            }
        }
    }
}
