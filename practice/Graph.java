package com.dsa.practice;

import java.util.*;

public class Graph {

    private static LinkedList<Integer> adj[];

    Graph(int v){
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    public static void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void createGraph(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of vertices");
        int v = sc.nextInt();
        System.out.println("enter number of edges");
        int e = sc.nextInt();
        Graph graph = new Graph(v);
        System.out.println("enter source and destination for given number of edges");
        for(int i = 0;i<e;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source,destination);
        }
    }
    public static void main(String [] args){
        /*
        5 6

        0 1
        1 2
        2 3
        3 4
        0 4
        2 4

        0 3
         */
        createGraph();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter source");
        int source = sc.nextInt();
        System.out.println("enter destination");
        int destination = sc.nextInt();
        bfsGraph(source,destination);
        if(dfs(source,destination)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void bfsGraph(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        vis[source] = true;
        parent[source] = -1;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur==destination) break;

            for(int neghbr: adj[cur]){
                if(!vis[neghbr]){
                    q.add(neghbr);
                    vis[neghbr] = true;
                    parent[neghbr] = cur;
                }
            }
        }

        int cur = destination;
        int distance = 0;
        while(parent[cur]!=-1) {
            distance++;
            System.out.print(cur + "-->");
            cur = parent[cur];
        }
        System.out.println(source);
        System.out.println("Min Distance is "+distance);
    }

    public static boolean dfs(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        return dfsUtil(source,destination,vis);
    }

    public static boolean dfsUtil(int source, int destination, boolean[] vis){
        if(source==destination)return true;

        for(int negbr:adj[source]){
            if(!vis[negbr]){
                vis[negbr] = true;
                boolean isConnected = dfsUtil(negbr,destination,vis);
                if(isConnected)return true;
            }
        }
        return false;
    }

    public static boolean dfsStack(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        Stack<Integer> st = new Stack<>();

        st.push(source);
        while(!st.isEmpty()){
            int cur = st.pop();
            if(cur==destination)return true;

            for(int negbr:adj[cur]){
                if(!vis[negbr]){
                    vis[negbr] = true;
                    st.push(negbr);
                }
            }
        }
        return false;
    }
}
