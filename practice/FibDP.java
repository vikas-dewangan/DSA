package com.dsa.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibDP {
    static Map<Integer,Long> map = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write nth term to know Fibonacci Value: ");
        int n = sc.nextInt();
        System.out.println(fibDP(n,map));
        System.out.println(fibRec(n));

    }
    // using dp
    public static long fibDP(int n,Map<Integer,Long> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<=2)
            return 1;
        map.put(n,fibDP(n-1,map)+fibDP(n-2,map));
        return map.get(n);
    }

    /* using recursion but check for 50...*/
     public static long fibRec(int n){
        if(n<=2)
            return 1;
        return fibRec(n-1)+fibRec(n-2);
    }
}