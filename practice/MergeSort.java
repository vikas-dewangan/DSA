package com.dsa.practice;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,2,7,1,3,9,4,6};
        mergeSort(arr,0,arr.length-1);
        System.out.print("[");
        for(int i:arr){
            System.out.print(" "+i+" ");
        }
        System.out.print("]");
    }
    public static void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] a, int start, int mid, int end){
        int n1 = mid-start+1;
        int n2 = end-mid;
        int[] arr = new int[n1];
        int[] brr = new int[n2];
        for(int i = 0;i<n1;i++){
            arr[i] = a[start+i];
        }
        for(int i=0;i<n2;i++){
            brr[i] = a[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while(i<n1 && j<n2){
            if(arr[i]<brr[j]){
                a[k] = arr[i];
                i++;
            }else{
                a[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = arr[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = brr[j];
            j++;
            k++;
        }
    }
}
