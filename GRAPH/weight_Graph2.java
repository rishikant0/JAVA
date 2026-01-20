import java.util.*;

public class weight_Graph2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int v = 4; // number of vertices
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        // initialize adjacency lists
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // adding edges
        graph.get(0).add(new Edge(0, 1, 5));

        graph.get(1).add(new Edge(0, 1, 3));
        graph.get(1).add(new Edge(0, 2, 3));

        graph.get(2).add(new Edge(1, 3, 8));

        graph.get(3).add(new Edge(2, 3, 7));

        // print the graph
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Edge> list = graph.get(i);
            for (int j = 0; j < list.size(); j++) {
                Edge e = list.get(j);
                System.out.println("Vertex " + e.src + " is connected to " + e.dest + " with weight " + e.wt);
            }
        }
    }
}