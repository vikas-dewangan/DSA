package com.vikasdew.javaapp;

import java.util.Scanner;

public class Rainwater {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for(int i = 0;i<n;i++){
            blocks[i] = sc.nextInt();
        }


        int[] leftArr = new int[n];
        int[] rightArr = new int[n];


        leftArr[0] = blocks[0];
        rightArr[n-1] = blocks[n-1];


        for(int i = 1;i<n;i++){
            if(blocks[i]>leftArr[i-1]){
                leftArr[i] = blocks[i];
            }else{
                leftArr[i] = leftArr[i-1];
            }
        }


        for(int i = n-2;i>=0;i--){
            if(blocks[i]>rightArr[i+1]){
                rightArr[i] = blocks[i];
            }else{
                rightArr[i] = rightArr[i+1];
            }
        }


        int waterTrapped = 0;

        for (int i = 0;i<n;i++){
            waterTrapped = waterTrapped+Math.min(leftArr[i],rightArr[i])-blocks[i];
        }
        System.out.println(waterTrapped);
    }
}
