package com.vikasdew.javaapp;

import java.util.*;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        if(size<2){
            System.out.println("Size must be greater than 2");
            return;
        }

        while(size-- > 0){
            list.add(sc.nextInt());
        }
        System.out.println(listArray(list));

    }

/*   [1 2 3 4 5]  -->    [1,5]  */

    public static List<Integer> listArray(List<Integer> list){
        Collections.sort(list);

        List<Integer> ans = new ArrayList<>();

        ans.add(list.get(0));
        ans.add(list.get(list.size()-1));

        return ans;
    }
}