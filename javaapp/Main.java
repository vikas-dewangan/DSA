package com.vikasdew.javaapp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[i] = temp*temp;
    }
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
}
