package com.vikasdew.javaapp;
/*
 0 1
 adj = {[1,2]} example of linked list array

 let v = 3;
 adj = { -> ,-> , -> };
 */

import java.util.*;
public class Graph {
    public static LinkedList<Integer> adj[];
    Graph(int v){
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public static void addEdge(int jo, int jisse){
        adj[jo].add(jisse);
        adj[jisse].add(jo);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(v);
        for(int i = 0;i<e;i++){
            int kon = sc.nextInt();
            int kisse = sc.nextInt();
            addEdge(kon,kisse);
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
        //bfs(source,destination);
     /*  System.out.print("[");
        for(int i = 0;i<adj.length;i++){
            System.out.print(adj[i]+",");
        }
        System.out.print("]");*/
    }

    public static void bfs(int source, int destination){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        q.add(source);
        parent[source] = -1;
        vis[source] = true;
        while (!q.isEmpty()){
            int cur = q.poll();
            if(cur==destination) break;
            for(int neghbr:adj[cur]){
                if(!vis[neghbr]){
                    q.add(neghbr);
                    vis[neghbr] = true;
                    parent[neghbr] = cur;
                }
            }
        }
        int cur = destination;
        while(parent[cur]!=-1){
            System.out.print(cur+"->");
            cur = parent[cur];
        }
        System.out.print(cur);
    }

}
