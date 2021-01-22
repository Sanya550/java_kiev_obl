package com.company.HW4;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        double p = Math.PI;

        Scanner s1 = new Scanner(System.in);
        System.out.print("High is: ");
        double h = s1.nextDouble();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Radius is: ");
        double r = s2.nextDouble();

        double volume = p*r*r*h;
        System.out.println("Volume is: "+volume);
    }
}
