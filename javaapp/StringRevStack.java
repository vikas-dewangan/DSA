package com.vikasdew.javaapp;

import java.util.Scanner;
import java.util.Stack;

public class StringRevStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++) {
            st.push(s.charAt(i));
        }
        for(int i = 0;i<s.length();i++){
            char temp = st.pop();
            System.out.print(temp);
        }
    }
}
