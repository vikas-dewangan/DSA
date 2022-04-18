package com.vikasdew.javaapp;

import java.util.ArrayList;
import java.util.List;
class MyClass {
    static long ans = 0;
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(3);
        System.out.print(calculateAmount(list));

    }
    public static long calculateAmount(List<Integer> prices) {
        ans += prices.get(0);
        for(int i = 1;i<prices.size();i++){
            int val = prices.get(0);
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<i;j++){
                if(min>prices.get(j)){
                    min = prices.get(j);
                }
            }
            // System.out.println(ans);
            // System.out.println(min);
            int check = val-min;
            if(check < 0){
                ans+=0;
            }
            else{
                ans+=check;
            }
        }
        return ans;
    }
}
