package com.dsa.practice;

import java.util.*;

public class TopViewOfBTree extends BinaryTreeTraversals{
    static Map<Integer,Integer> mp = new HashMap<>();
    public static void main(String [] args){
        Node root = tree();
//        topView(root, root.data);

        ArrayList<Integer> ans = topViewOfTree(root);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
    // simple but wrong way
    public static void topView(Node root, int c){
        if(root==null)return;
        if(!mp.containsKey(c))
            System.out.print(root.data+" ");
        mp.put(c,root.data);
        topView(root.left,c-1);
        topView(root.right,c+1);
    }


    // right way
    public static ArrayList<Integer> topViewOfTree(Node root){
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();

        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)){ // this condition will be removed for bottom view
                map.put(cur.hd, cur.node.data);
            }
            if(cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null){
                q.add(new Pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

}

class Pair{
    int hd;
    Node node;
    Pair(int hd, Node node){
       this.node = node;
       this.hd = hd;
    }
}
