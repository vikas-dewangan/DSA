package com.vikasdew.javaapp;

public class Dikjastra {
public static void main(String[] args){
    String s =  "123hello1234";
    int num = 0;
    for(int i = 0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            int digit = Character.getNumericValue(s.charAt(i));
            num = num+digit;
            num*=10;
        }
    }
    System.out.println(num/10);
}
}
