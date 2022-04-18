package com.vikasdew.javaapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibo {
    static Map<Integer,Long> map = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write nth term to know Fibonacci Value: ");
        int n = sc.nextInt();
        // System.out.print(fib(n));
        System.out.print(fib(n,map));
    }
        // using dp
    public static long fib(int n,Map<Integer,Long> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<=2)
            return 1;
        map.put(n,fib(n-1,map)+fib(n-2,map));
        return map.get(n);
    }

    /* using recursion but check for 50...
     public static long fib(int n){
        if(n<=2)
            return 1;
        return fib(n-1)+fib(n-2);
    }*/
}
