package com.company.HW4;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        double differ;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Name of first team: ");
        String t1 = s1.next();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Name of second team: ");
        String t2 = s2.next();

        Scanner r1 = new Scanner(System.in);
        System.out.println("Score of first team: ");
        double m = r1.nextDouble();

        Scanner r2 = new Scanner(System.in);
        System.out.println("Score of second team: ");
        double l = r2.nextDouble();

        if(m>l){
            differ = (double)(100-(l/m)*100);
            System.out.println(t1+" advance on "+differ+" percent");
        }
        if(l>m){
            differ = (double)(100-(m/l)*100);
            System.out.println(t2+" advance on "+differ+" percent");
        }
        if(m==l){
            System.out.println("Score of "+t1+" and "+t2+" are equal now ");
        }


    }
}
