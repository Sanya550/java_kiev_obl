package com.company.HW6;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int summary = 0;
        int [] arr = {2,33,22,-55, 55,222,12,-1,43,21};

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10: ");
        int a = s.nextInt();

        for(int i = 0;i < a;i++){
            summary += arr[i];
        }
        System.out.println("Сумма равняется: " + summary);
    }
}
