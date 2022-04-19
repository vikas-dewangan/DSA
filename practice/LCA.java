package com.dsa.practice;

public class LCA extends BinaryTreeTraversals {
    public static void main(String[] args){
        Node root = tree();
        System.out.println(LCA(root,1,2).data);
    }

    public static Node LCA(Node root, int u, int v){
        if(root==null)
            return null;
        if(root.data==u || root.data==v){
            return root;
        }
        Node left = LCA(root.left,u,v);
        Node right = LCA(root.right,u,v);
        if(left==null){
            return right;
        }if(right==null)
            return left;

        return root;
    }
}
