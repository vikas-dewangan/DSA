package com.vikasdew.javaapp;

import java.util.*;

/*
1D Array
2D Array
Vector
Pair
ArrayList
Set
Map
*/
public class Stl {

    public static void main(String[] args) {


        // ArrayList

        List<Integer> new_list = new ArrayList<>();
        new_list.add(2);
        new_list.add(8);
        new_list.add(1);

//        System.out.println(new_list);
//        System.out.println(new_list.size());
////        new_list.remove(1); // removes index
////        new_list.remove(new Integer(1)); //removes value
//
//        new_list.add(0,2); // add value to the given index
//
//        new_list.set(0,3); // it updates the value
//
//        System.out.println(new_list.get(1));

//        traversing in list

//        for(int i = 0;i< new_list.size();i++){
//            System.out.println(new_list.get(i));
//        }

//        for(int i:new_list){
//            System.out.println(i);
//        }

        List<Integer> second_list = new ArrayList<>();
        second_list.add(4);
        second_list.add(5);
        second_list.add(6);

        new_list.addAll(second_list);

        Iterator itr = new_list.iterator();
        int sum = 0;
        while (itr.hasNext()) {
            sum += (int) itr.next();
        }

//        System.out.println(sum);
//        System.out.println(new_list.contains(2));  O(n)


        // SET - store unique value

        List<Integer> list = Arrays.asList(2, 5, 1, 0, -3, 1, 0);

        Set<Integer> st = new HashSet<>(list); // store as hash value
        Set<Integer> st1 = new TreeSet<>(list); // automatically maintains order
        Set<Integer> st2 = new LinkedHashSet<>(list); // store as given
//        System.out.println(st);
//        System.out.println(st1);
//        System.out.println(st2);

        Integer[] array = {1, 1, 7, 2, 4, 2, 5, 9};
        Set<Integer> new_Array = new LinkedHashSet<>(Arrays.asList(array));

//        for(int i:new_Array){
//            System.out.println(i);
//        }

//        System.out.println(st.contains(1)); // O(n) same for LinkedHashSet
//        System.out.println(st1.contains(1)); // O(log(n)) for TreeSet

        // MAP - key value pair

        Map<Integer, Integer> mp = new TreeMap<>();
        mp.put(10, 100);
        mp.put(20, 400);
        mp.put(5, 600);
        mp.put(1, 10);
//        System.out.println(mp.containsKey(5)); // O(1)

//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
//        System.out.println(mp.get(1));

    for(Map.Entry<Integer, Integer> entry:mp.entrySet())
    {
        int key = entry.getKey();
        int value = entry.getValue();
        System.out.println(key+" | "+value);
    }
}
}
