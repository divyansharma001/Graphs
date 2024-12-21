package Representation;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        // representation of graph in java using adjacency matrix
        int n = 3;
        int m = 3;
        //can use only one variable here if want
 
        //1 based indexing 
        int adj[][] = new int[n + 1][m + 1];

        // for edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // for edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // for edge 3--1
        adj[3][1] = 1;
        adj[1][3] = 1;

        printAdjacencyMatrix(m,n,adj);
    }

    public static void printAdjacencyMatrix(int m,int n,int adj[][]){
    for(int i=0;i<=n;i++){
        for(int j=0;j<=m;j++){
            System.out.print(adj[i][j] + " ");
        }
        System.out.println();
    }
    }
}

