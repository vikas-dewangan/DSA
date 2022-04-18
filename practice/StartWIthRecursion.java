package com.dsa.practice;

public class StartWIthRecursion {
    public static void main(String[] args){
//        System.out.println(sumOfNaturals(3));
//        System.out.println(pow(2,3));
//        System.out.println(powWithLessTime(2,3));
//        System.out.println(pathInGrid(2,0));
    }



    public static int sumOfNaturals(int n){
        if(n==1)
            return 1;
        return n+ sumOfNaturals(n-1);
    }



    public static int pow(int n, int p){
        if(p==1){
            return n;
        }
        return n*pow(n,p-1);
    }



    public static int powWithLessTime(int n, int p){
        if(p==1){
            return n;
        }
        if(p%2==0){
            return n*powWithLessTime(n,p/2);
        }
        return n*powWithLessTime(n,p-1);
    }


    public static int pathInGrid(int m,int n){
        if(n==0||m==0){
            return 0;
        }
        if(n==1 || m==1){
            return 1;
        }
        return pathInGrid(m,n-1)+pathInGrid(m-1,n);
    }
}
