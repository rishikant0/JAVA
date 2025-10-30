package GRAPH;

public class represent {
    public static void main(String[] args) {
        int v = 3;
        int e = 3;
        int adj[][] = new int[v + 1][v + 1];
        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;
        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;
        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;
    }
}
