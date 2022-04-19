package com.dsa.practice;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBTree extends BinaryTreeTraversals {
        public static void main(String[] args){
            Node root = tree();
            leftView(root);
        }
        public static void leftView(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int numOfNodes = q.size();
                for(int i=0;i<numOfNodes;i++){
                    Node temp = q.poll();
                    if(i==0){
                        System.out.print(temp.data);
                    }
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                }
            }
        }
    }

