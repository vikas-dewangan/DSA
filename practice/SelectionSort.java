package com.dsa.practice;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,6,8,2,1,0,10};
        for(int i = 0;i<arr.length-1;i++){
            int min_indx = i;
            for(int j = i+1;j<arr.length;j++) {
                if (arr[min_indx] > arr[j]) {
                    min_indx = j;
                }
            }
               int temp = arr[min_indx];
               arr[min_indx] = arr[i];
               arr[i] = temp;

        }
        System.out.print("[");
        for(int i:arr){
            System.out.print(" "+i+" ");
        }
        System.out.print("]");
    }
}
