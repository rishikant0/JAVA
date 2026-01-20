import java.util.*;

public class HasPath {
    
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<ArrayList<Edge>> graph, int v) {
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(1).add(new Edge(1, 2));
        graph.get(1).add(new Edge(1, 3));
        graph.get(2).add(new Edge(2, 4));
        graph.get(3).add(new Edge(3, 5));
        graph.get(4).add(new Edge(4, 5));
    }

    static boolean haspath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] vis) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;

        for (int i = 0; i < graph.get(src).size(); i++) {
            Edge e = graph.get(src).get(i);
            if (!vis[e.dest] && haspath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        createGraph(graph, v);
        System.out.println(haspath(graph, 0, 5, new boolean[v])); // should print true
    }
}