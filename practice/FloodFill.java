package com.dsa.practice;

public class FloodFill {
    public static void main(String[] args){
        int[][] a = {
                {1,1,1,1},
                {1,1,2,1},
                {1,2,3,1},
                {2,2,3,1}
        };
        floodFill(a,0,1,5,1);
        print(a);
    }
    public static void floodFill(int[][] a, int r, int c, int toFill, int preFill){
        int row = a.length;
        int col = a[0].length;
        if(r<0 || r>=row || c<0 || c>=col){
            return;
        }
        if(a[r][c] != preFill){
            return;
        }
        a[r][c] = toFill;
        floodFill(a,r-1,c,toFill,preFill);
        floodFill(a,r+1,c,toFill,preFill);
        floodFill(a,r,c-1,toFill,preFill);
        floodFill(a,r,c+1,toFill,preFill);
    }

    public static void print(int[][] a){
        for(int i = 0;i<a.length;i++){
            System.out.print("{");
            for(int j = 0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("}");
        }
    }
}
