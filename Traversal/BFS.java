package Traversal;

import java.util.*;

public class BFS {

public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
ArrayList<Integer> bfs = new ArrayList<>();
boolean[] visited = new boolean[V];
Queue<Integer> q = new LinkedList<>();

q.add(0);
visited[0]=true;

while(!q.isEmpty()){
  Integer node = q.poll();
  bfs.add(node);

  for (int i = 0; i < adj.get(node).size(); i++) {
    int it = adj.get(node).get(i);
    if (!visited[it]) {
        visited[it] = true;
        q.add(it);
    }
}

}

return bfs;
}

}

/*
 * Algorithm:
 * 
 * 1. Queue data structure: follows FIFO, and will always contain the starting.
 * 2. Visited array: an array initialized to 0
 * 3. In BFS, we start with a “starting” node, mark it as visited, and push it
 * into the queue data structure.
 * 4. In every iteration, we pop out the node ‘v’ and put it in the solution
 * vector, as we are traversing this node.
 * 5. All the unvisited adjacent nodes from ‘v’ are visited next and are pushed
 * into the queue. The list of adjacent neighbors of the node can be accessed
 * from the adjacency list.
 * 6. Repeat steps 2 and 3 until the queue becomes empty, and this way you can
 * easily traverse all the nodes in the graph.
 * 
 */

/*
 * Diffrence between .poll() and .remove() in queue in JAVA
 1. poll()
 * Description: Retrieves and removes the head of the queue, or returns null if
   the queue is empty.
 * Behavior with Empty Queue: Returns null instead of throwing an exception.
 * Use Case: When you want to handle an empty queue gracefully without dealing
   with exceptions.
 2. remove()
 * Description: Retrieves and removes the head of the queue, but throws a
   NoSuchElementException if the queue is empty.
 * Behavior with Empty Queue: Throws a NoSuchElementException.
 * Use Case: When you are certain the queue is not empty and want to enforce
   stricter error handling.
 */
