package com.company.HW6;

public class Ten {
    public static void main(String[] args) {
        int [] arr = {3,8,6,44,0,-33,54,91,777,-543,22,11};
        int min1 = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min1){
                min1 = arr[i];
            }
        }
        System.out.println(min1);

        int min2 = 999;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]==min1){
                continue;
            }
            if(arr[j] < min2){
                min2 = arr[j];
            }
        }
        System.out.println(min2);

        int min3 = 999;
        for(int k = 0;k<arr.length;k++){
            if((arr[k]==min1)||(arr[k]==min2)){
                continue;
            }
            if(arr[k] < min3){
                min3 = arr[k];
            }
        }
        System.out.println(min3);

        int min4 = arr[0];
        for(int a = 0;a<arr.length;a++){
            if((arr[a]==min1)||(arr[a]==min2)||(arr[a]==min3)){
                continue;
            }
            if(arr[a] < min4){
                min4 = arr[a];
            }
        }
        System.out.println(min4);

        int min5 = 999;
        for(int b = 0;b<arr.length;b++){
            if((arr[b]==min1)||(arr[b]==min2)||(arr[b]==min3)||(arr[b]==min4)){
                continue;
            }
            if(arr[b] < min5){
                min5 = arr[b];
            }
        }
        System.out.println(min5);
    }
}
