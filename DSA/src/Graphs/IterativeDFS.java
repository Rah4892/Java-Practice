package Graphs;

import java.util.*;

public class IterativeDFS {
    static class Graph {
        int V; //no of vertices

        LinkedList<Integer>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];

            for(int i=0;i<adjList.length; i++) {
                adjList[i] = new LinkedList<Integer>();
            }
        }

        void addEdge(int u, int v){
            adjList[u].add(v);
        }

        void DFS (int s) {
            //Initially mark all the vertices as not visited
            Vector<Boolean> visited = new Vector<Boolean>(V);
            for(int i=0;i<V;i++) {
                visited.add(false);
            }

            Stack<Integer> stack = new Stack<>();
            stack.push(s);

            while(!stack.isEmpty()) {
                s = stack.peek();
                stack.pop();

                //check for vertex visited or not
                if(visited.get(s) == false) {
                    System.out.println(s + " ");
                    visited.set(s, true);
                }

                //Get the adjacent nodes of the visited vertex ad push to the stack if not visited
                Iterator<Integer> itr = adjList[s].iterator();

                while (itr.hasNext()) {
                    int v = itr.next();
                    if (!visited.get(v)) {
                        stack.push(v);
                    }
                }

            }
        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,1);
        graph.addEdge(0,3);
        graph.addEdge(1,4);

        System.out.println("DFS - ");
        graph.DFS(0);
    }
}
