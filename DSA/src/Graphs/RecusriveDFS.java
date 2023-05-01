package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class RecusriveDFS {
    public static void main(String args[]) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        boolean visited[] = new boolean[4];

        graph.DfsUtil(2, visited);
    }

    static class Graph {
        private int V;
        private LinkedList<Integer>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];
            for(int i=0;i< adjList.length;i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int u, int v) {
            adjList[u].add(v);
        }

        void DfsUtil(int v, boolean visited[]) {
            visited[v] = true;
            System.out.println(v +" ");

            Iterator<Integer> itr = adjList[v].iterator();
            while (itr.hasNext()) {
                int next = itr.next();
                if(!visited[next]) {
                    DfsUtil(next, visited);
                }
            }
        }

    }
}
