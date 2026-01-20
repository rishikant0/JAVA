import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

public class Basic {
    public static void main(String[] args) {
        int V = 6; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V]; // array of ArrayLists

        // initialize each vertex with an empty list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // add edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));

        // print graph
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.println("src:" + e.src + " dest:" + e.dest);
            }
        }
    }
}
