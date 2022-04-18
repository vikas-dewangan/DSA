package com.vikasdew.javaapp;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(4);
        root.right.right = new Node(8);
//        bfs(root);
//        leftView(root);
//        width(root);
    }

   /* public static void bfs(Node root){
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }*/

   /* public static void leftView(Node root){
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int numnode = q.size();
            for(int i = 1;i<=numnode;i++){
                Node temp = q.poll();
                if(i==1)
                    System.out.println(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);}
        }
    }*/

    
}

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
