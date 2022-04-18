package com.dsa.practice;
/*
two players are there, and they have some coins arranged in linear manner, they need to choose coins one by one either leftmost or rightmost,
the person who will have the max amount in last will win the game.
*/
public class CoinGameTheory {
    public static void main(String[] args){
        int[] arr = {1,5,700,2};
        System.out.println(gameTheory(arr,0,arr.length-1));
    }
    public static int gameTheory(int[] a, int l, int r){
        if(l+1==r){
            return Math.max(a[l],a[r]);
        }

        /*
        1 5 7 3 2 4
        a[0]+min{ (2,3)   (1,2)

        a[3]+min{ (1,2)   (0,1)
         */
        return Math.max(a[l]+Math.min(gameTheory(a,l+2,r),gameTheory(a,l+1,r-1)),
                a[r]+Math.min(gameTheory(a,l+1,r-1),gameTheory(a,l,r-2)));
    }
}
