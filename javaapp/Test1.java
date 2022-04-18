package com.vikasdew.javaapp;

/*      Given two integer arrays of same size, nums and indexes, reorder elements in nums according to given indexes array.

        Example 1:

        Input: nums = [24, 56, 74, -23, 87, 91], indexes = [1, 2, 3, 0, 4, 5]
        Output: [56, 74, -23, 24, 87, 91]

        Example 2:

        Input: nums = [10, 11, 12], indexes = [1, 0, 2]
        Output: [11, 10, 12]

        Expected O(n) time and O(1) space solution.


        result[i] = arr[(index[i]=)1]=56


        */

import java.util.Scanner;

public class Test1 {
    public static void swap(int[] arr,int i,int t){
        int temp = arr[i];
        arr[i] = arr[t];
        arr[t] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] indexes = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
            System.out.print(nums[i]+" ");
        }System.out.println();
        for(int i = 0;i<n;i++){
            indexes[i] = sc.nextInt();
            System.out.print(indexes[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            swap(nums,i,indexes[i]);
        }
        for (int i: nums) {
            System.out.print(i+" ");
        }
    }
}
