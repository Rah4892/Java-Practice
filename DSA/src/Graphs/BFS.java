package Graphs;

import java.util.LinkedList;

public class BFS {
    class Graph{
        private int v;
        private LinkedList<Integer> adjList[];

        Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            for(int i=0;i<v;i++){
                adjList[i] = new LinkedList<>();
            }
        }
    }
}
