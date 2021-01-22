package com.company.HW5;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("How much your dinner:");
        int a = t.nextInt();

        System.out.println("1 - terrible: "+0);
        System.out.println("2 - poor: "+(0.05*a));
        System.out.println("3 - good: "+(0.1*a));
        System.out.println("4 - great: "+(0.15*a));
        System.out.println("5 - excellent: "+(0.2*a));
    }
}
