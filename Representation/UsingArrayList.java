package Representation;

import java.util.*;

public class UsingArrayList {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // for 1 based indexing otherwise <n
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        /*
         * in general for u--v
         * adj.get(u).add(v);
         * adj.get(v).add(u);
         */

        // for edge 1--2

        adj.get(1).add(2);
        adj.get(2).add(1);

        // for edge 2--3

        adj.get(2).add(3);
        adj.get(3).add(2);

        // for edge 3--1

        adj.get(3).add(1);
        adj.get(1).add(3);

        printArrayList(n, m, adj);

    }

    private static void printArrayList(int n, int m, ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

// here space complexity is O(2M) here m is the number of edges