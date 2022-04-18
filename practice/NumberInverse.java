package com.dsa.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberInverse {
    public static void main(String[] args){
        int num = 3412;
        Map<Integer, Integer> temp = new LinkedHashMap<>();
        int pos = 1;
        while (num!=0){
            int temp1 = num%10;
            temp.put(temp1,pos);
            num = num/10;
            pos++;
        }
        while(pos-->1){
            System.out.print(temp.get(pos)+" ");
        }
    }
}
