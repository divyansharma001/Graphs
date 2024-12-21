package Representation;

public class Main{
    public static void main(String[] args) {
        //representation of graph in java
        int n=3;
        int m=3;
        int adj[][] = new int[n+1][m+1];

        //for edge 1--2
        adj[1][2]=1;
        adj[2][1]=1;

        //for edge 2--3
        adj[2][3]=1;
        adj[3][2]=1;
      
        //for edge 3--1
        adj[3][1]=1;
        adj[1][3]=1;
    }
}
