package com.dsa.practice;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5,2,7,1,3,9,4,6};
        quickSort(arr,0,arr.length-1);
        System.out.print("[");
        for(int i:arr){
            System.out.print(" "+i+" ");
        }
        System.out.print("]");
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot_indx = partition(arr, start,end);
            quickSort(arr,start,pivot_indx-1);
            quickSort(arr,pivot_indx+1,end);
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j = start;j<end;j++){
            if(pivot>arr[j]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
