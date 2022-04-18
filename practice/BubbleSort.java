package com.dsa.practice;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,6,8,2,1,0,10};
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("[");
        for(int i:arr){
            System.out.print(" "+i+" ");
        }
        System.out.print("]");
    }
}
