package com.dsa.practice;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {

    // to print unique string if 2 or more char are same we use set
    static Set<String> st = new HashSet<>();
    public static void main(String [] args){
        String s = "abcc";
        permutation(s,0,s.length()-1);
    }
    public static void permutation(String s, int l, int r){
        if(l==r){
            if(st.contains(s))return;
            st.add(s);
            System.out.println(s);
            return;
        }
        for(int i = l;i<=r;i++){
            s = interChange(s,l,i);
            permutation(s,l+1,r);
            interChange(s,l,i);
        }
    }
    public static String interChange(String s, int l, int r){
        char[] array = s.toCharArray();
        char temp = array[l];
        array[l] = array[r];
        array[r] = temp;
        return String.valueOf(array);
    }
}
