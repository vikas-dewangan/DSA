package com.vikasdew.javaapp;

import java.util.*;

public class Graphdfs {
    public static LinkedList<Integer> adj[];
    Graphdfs(int v){
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public static void addEdge(int jo, int jisse){
        adj[jo].add(jisse);
        adj[jisse].add(jo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graphdfs g = new Graphdfs(v);
        for (int i = 0; i < e; i++) {
            int kon = sc.nextInt();
            int kisse = sc.nextInt();
            addEdge(kon, kisse);
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
        System.out.println(dfsStack(source,destination));
    }
    public static boolean dfsStack(int source,int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        Stack<Integer> st = new Stack<>();
        st.push(source);
        while (!st.isEmpty()){
            int cur = st.pop();
            if(cur==destination) return true;
            for(int negbr:adj[cur]){
                if(!vis[negbr]){
                    vis[negbr] = true;
                    st.push(negbr);
                }
            }
        }
        return false;
    }




    public static boolean dfsRec(int source, int destination,boolean vis[])
    {
        if(source==destination) return true;
        for(int nebgr:adj[source]){
            if(!vis[nebgr]){
                vis[nebgr] = true;
                boolean isConnected = dfsRec(nebgr,destination,vis);
                if(isConnected) return true;
            }
        }
        return false;
    }
    public static boolean dfs(int source,int destination){
        boolean[] vis = new boolean[adj.length];
        vis[source] = true;
        return dfsRec(source,destination,vis);
    }

}
