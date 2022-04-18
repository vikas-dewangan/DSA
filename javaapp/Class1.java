package com.vikasdew.javaapp;


class Parent{
    int a = 1;
    void m2(){
        System.out.println("parent here");
    }
}


class Child extends Parent{
    int a = 2;
    void m1(){
        System.out.println("Child here");
    }
}

public class Class1{
    public static void main(String[] args){
        Child c = new Child();
        c.m2();
    }
}
