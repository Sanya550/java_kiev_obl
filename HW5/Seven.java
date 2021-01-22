package com.company.HW5;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many days will you live here?");
        int a = s.nextInt();

        if(a<5&&a>=0){
            System.out.println("It will cost you: "+(a*40)+" grn");
        }
        if((a>=5)&&(a<=6)){
            System.out.println("It will cost you: "+((a*40)-20)+" grn");
        }
        if(a>=7){
            System.out.println("It will cost you: "+((a*40)-50)+" grn");;
        }
        if(a<0){
            System.out.println("It is impossible");
        }
    }
}
