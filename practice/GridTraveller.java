package com.dsa.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
find number of ways to travel from upper left to bottom right in any grid

 [s| | | ]
   -----
 [ | | |d]

 s = start, d = destination
 */
public class GridTraveller {
    static Map<String,Long> dp = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println(gridTravel(row,column,dp));
    }
    // in dp for memoization, m,n is same as n,m => 2,1 = 1,2


    public static long gridTravel(int m, int n,Map<String,Long> dp){
        String key = m+","+n;
        if(dp.containsKey(key)) return dp.get(key);
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;

        long v = gridTravel(m-1,n,dp)+gridTravel(m,n-1,dp);
        dp.put(key,v);
        return dp.get(key);
    }

    /* using simple recursion, try 18,18...
    public static int gridTravel(int m, int n){
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;

        return gridTravel(m-1,n)+gridTravel(m,n-1);
    }*/
}