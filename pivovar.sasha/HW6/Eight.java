package com.company.HW6;

import java.util.Random;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        for(int i=100000;i<1000000;i++){
            int i1=i/100000%10,
                    i2=i/10000%10,
                    i3=i/1000%10,
                    i4=i/100%10,
                    i5=i/10%10,
                    i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                System.out.println(" "+i1+i2+i3+i4+i5+i6);
            }
        }

    }
}
