package com.vikasdew.javaapp;

public class Anagram {
    public static void main(String[] args){
        String s1 = "sooooabc";
        int[] asciiArr = new int[123];
        for(int i = 0;i<s1.length();i++) {
            int asciiIdx = (int) s1.charAt(i);
            int prev = asciiArr[asciiIdx];
            prev++;
            asciiArr[asciiIdx] = prev;
        }
        for(int i = 0;i<asciiArr.length;i++){
            if(asciiArr[i]==1){
                System.out.println((char)i);
            }
        }
    }
}
