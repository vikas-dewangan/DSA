package com.dsa.practice;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumRemaining = 0;
        int total = 0;
        int start = 0;
        for(int i = start;i<gas.length;i++){
            int remaining = gas[i]-cost[i];
            if(sumRemaining>=0)
                sumRemaining+=remaining;
            else{
                sumRemaining = remaining;
                start = i;
            }
            total+=remaining;
        }
        if(total>=0){
            return start;
        }else
            return -1;
    }
    public static void main(String[] args){
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }

}
