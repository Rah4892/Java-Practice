package Graphs;

import java.util.Scanner;

public class AdjMatrixRep {
    public static void main(String[] args) {
        int n = 5; //vertices
        int m = 7; //edges
        Scanner sc = new Scanner(System.in);
        //create a 2D array for storing edge info
        int adjMatrix[][] = new int[n+1][n+1];

        //traverse the graph for each edge
        for (int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
            //for directed graphs, assign only one of these to 1

        }

    }
}
