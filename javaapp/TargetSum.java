package com.vikasdew.javaapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TargetSum {
    static Map<Integer,Boolean> dp = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        if(targetSum(arr,target,dp)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
    // using memoization
    public static boolean targetSum(int[] arr, int target, Map<Integer,Boolean> memo){
        if(memo.containsKey(target)) return memo.get(target);

        if(target==0) return true;
        if(target<0) return false;
        for(int num:arr){
            int newTarget = target-num;
            if(targetSum(arr,newTarget,memo)){
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }

   /*
   use with target= 300, arr = [7, 14]
    public static boolean targetSum(int[] arr, int target){
        if(target==0) return true;
        if(target<0) return false;
        for(int num:arr){
            int newTarget = target-num;
            if(targetSum(arr,newTarget)){
                return true;
            }
        }
        return false;
    }*/
}
