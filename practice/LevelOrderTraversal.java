package com.dsa.practice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal extends BinaryTreeTraversals{
    public static void main(String[] args){
    Node root = tree();
    bfs(root);
    }
    public static void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
}
