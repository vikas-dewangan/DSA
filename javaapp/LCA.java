package com.vikasdew.javaapp;

import java.util.Scanner;
/*
6
2 4
5 3
-1 -1
-1 -1
6 -1
-1 -1
3 6     not work for value not in tree
o/p - 2

public class LCA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        Node[] tree = new Node[nodes+1];
        for (int i = 1;i<=nodes;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree[i] = new Node(a,b);
        }
        int u = sc.nextInt();
        int v = sc.nextInt();
        int ans = lowestComAn(tree,u,v,1);
        System.out.print(ans);
    }

    public static int lowestComAn(Node[] tree,int u,int v,int val){
        if(val == -1)
            return -1;
        if(val==u)
            return u;
        if(val==v)
            return v;
        int l = lowestComAn(tree,u,v,tree[val].lChild);
        int r = lowestComAn(tree,u,v,tree[val].rChild);
        if(l!=-1 && r!=-1)
            return val;
        if(l!=-1)
            return l;
        else
            return r;
    }
}
class Node{
    public Node left;
    int lChild;
    int rChild;
    Node(int lChild, int rChild){
        this.lChild = lChild;
        this.rChild = rChild;
    }
}*/
