package com.dsa.practice;

// tree definition

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}

/* Tree Traversals
      5
    /   \
   3     4
  / \   /
 1   2 8
        \
         9

 inOrder   = 1 3 2 5 8 4
 preOrder  = 5 3 1 2 4 8
 postOrder = 1 2 3 8 4 5
*/

public class BinaryTreeTraversals {
    public static Node tree(){
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.left = new Node(8);
        root.right.left.right = new Node(9);
        return root;
    }
    public static void main(String[] args){
        Node root = tree();
        System.out.print("InOrder :- ");
        inOrder(root);
        System.out.println();
        System.out.print("PreOrder :- ");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder :- ");
        postOrder(root);
    }
    public static void inOrder(Node root){ // left, root, right
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){ // root, left, right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){ // left, right, root
        if(root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
