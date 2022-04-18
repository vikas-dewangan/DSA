package com.vikasdew.javaapp;

import java.util.Scanner;

public class Quick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot_index = partition(arr,start,end);
            quickSort(arr,start,pivot_index-1);
            quickSort(arr,pivot_index+1,end);
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j = start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
