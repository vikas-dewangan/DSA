package com.dsa.practice;

public class BinaryTreeHeightAndDia extends BinaryTreeTraversals{
    public static void main(String[] args){
        Node root = tree();
        System.out.println(getHeight(root));
        System.out.println(getDiameter(root));
    }
    public static int getHeight(Node root){
        if(root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    public static int getDiameter(Node root){ // The number of nodes on longest path btw 2 leaf nodes
        if(root == null)
            return 0;
        return Math.max((getHeight(root.left)+getHeight(root.right)+1),Math.max(getDiameter(root.left),getDiameter(root.right)));
    }
}

