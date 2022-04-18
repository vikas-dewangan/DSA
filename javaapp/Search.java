package com.vikasdew.javaapp;

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for linear search and 2 for binary search..");
        int inp = sc.nextInt();
        System.out.println("length of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("if you have chosen binary search than you array should be in sorted order ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched..");
        int num = sc.nextInt();
        if(inp==1){
            System.out.println(linearSearch(arr,num));
        }else if(inp==2){
            System.out.println(binarySearch(arr,num));
        }else{
            System.out.println("Wrong Input...");
        }
    }
    public static boolean linearSearch(int[] arr, int num){
        for(int i:arr){
            if(i==num){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==num){
                return true;
            }else if(arr[mid]>num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }


    public static boolean binarySearchRec(int[] arr,int start, int end, int num){
        if(start>end){
            return false;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==num){
            return true;
        }else if(arr[mid]>num){
            binarySearchRec(arr,start,mid-1,num);
        }else{
            binarySearchRec(arr, mid+1, end, num);
        }
        return false;
    }
}
