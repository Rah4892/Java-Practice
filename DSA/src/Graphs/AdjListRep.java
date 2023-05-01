package Graphs;

import java.util.ArrayList;

public class AdjListRep {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(V);

        for (int i =0;i<V;i++)
            adjList.add(new ArrayList<Integer>());

            addEdge(adjList, 0, 1);
            addEdge(adjList, 0, 4);
            addEdge(adjList, 1, 2);
            addEdge(adjList, 1, 3);
            addEdge(adjList, 1, 4);
            addEdge(adjList, 2, 3);
            addEdge(adjList, 3, 4);

            printGraph(adjList);

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
        for (int i=0;i<adjList.size();i++) {
            System.out.println("Adjacency list of vertex " + i);
            for (int j=0;j<adjList.get(i).size();j++) {
                System.out.print("->" +  adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
