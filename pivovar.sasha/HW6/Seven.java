package com.company.HW6;

public class Seven {
    public static void main(String[] args) {
        int [] arr = { 5,77,999,34,1,-44,23,0 };
        int sumNe = 0;
        int sumCh = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                sumNe += arr[i];
            }
            if(arr[i]%2==1){
                sumCh += arr[i];
            }
        }
        System.out.println("Сумма нечетных елементов равняется: "+sumNe);
        System.out.println("Сумма четных елементов равняется: "+sumCh);
    }
}
