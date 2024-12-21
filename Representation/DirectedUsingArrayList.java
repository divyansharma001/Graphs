package Representation;

import java.util.ArrayList;

public class DirectedUsingArrayList {
    // representation of directed graph using ArrayList
    public static void main(String[] args) {
        int n = 3;
        int e = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // for 1 indexing

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        /*
         * for u-->v
         * adj.get(u).add(v);
         */

        // for 1-->2

        adj.get(1).add(2);

        // for 2-->3

        adj.get(2).add(3);

        // for 3-->1

        adj.get(3).add(1);

        printArrayList(n, e, adj);

    }

    private static void printArrayList(int n, int e, ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
