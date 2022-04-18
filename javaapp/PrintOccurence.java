package com.vikasdew.javaapp;

import java.util.HashMap;
import java.util.Map;

public class PrintOccurence {
    public static void main(String[] args){

        int[] array = {1,2,3,2,0,7,5,7,1,1};
        Map<Integer,Integer> mp = new HashMap();

        for(int i:array){
            if(mp.containsKey(i)){
                int temp = mp.get(i);
                temp++;
                mp.put(i,temp);
            }
            else{
                mp.put(i,1);
            }
        }

        for(Map.Entry<Integer, Integer> entry:mp.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" | "+value);
        }
    }
}
