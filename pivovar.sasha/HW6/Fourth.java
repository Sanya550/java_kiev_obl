package com.company.HW6;

public class Fourth {
    public static void main(String[] args) {
        int index = 1;
        for (int i = 2;index<=20;i = (int) Math.pow(2,index)){
            System.out.println(i);
            index++;
        }
    }
}
