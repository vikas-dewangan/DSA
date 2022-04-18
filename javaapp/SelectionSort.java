package com.vikasdew.javaapp;

import java.util.Scanner;

public class SelectionSort {
    public static void selection(int[] arr, int n){
        for(int i = 0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selection(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
