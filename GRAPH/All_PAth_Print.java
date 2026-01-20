import java.util.*;

public class All_PAth_Print {

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

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 4));

        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 4));
        graph.get(3).add(new Edge(3, 5));

        graph.get(4).add(new Edge(4, 2));
        graph.get(4).add(new Edge(4, 3));
        graph.get(4).add(new Edge(4, 5));

        graph.get(5).add(new Edge(5, 3));
        graph.get(5).add(new Edge(5, 4));
    }

    static void printAllPath(ArrayList<ArrayList<Edge>> graph, int curr, boolean[] vis, String path, int target) {
        if (curr == target) {
            System.out.println(path + target);
            return;
        }

        vis[curr] = true;
        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if (!vis[e.dest]) {
                printAllPath(graph, e.dest, vis, path + curr + "->", target);
            }
        }
        vis[curr] = false;
    }

    public static void main(String[] args) {
        int v = 6; // vertices 0..5
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        createGraph(graph, v);

        int src = 0, target = 5;
        boolean[] vis = new boolean[v];

        printAllPath(graph, src, vis, "", target);
    }
}