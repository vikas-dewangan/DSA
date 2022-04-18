package com.dsa.practice;

// To perform Binary Search, Array must be sorted...
public class BinarySearch {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9};
    if(binarySearch(arr,5)){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }
    }
    public static boolean binarySearch(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==n){
                return true;
            }
            else if(arr[mid]>n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
