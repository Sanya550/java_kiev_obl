package com.company.HW6;

public class Sixth {
    public static void main(String[] args) {

        int [] arr= { 5,77,999,34,1, -44,23,0 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min) {
                min = arr[i];

            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Minimal: "+min);
        System.out.println("Maximum: "+max);


    }}
