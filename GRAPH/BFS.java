import java.util.*;

public class BFS {
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
        graph.get(5).add(new Edge(5, 4)); // ✅ now inside the method
    }

    static void bfs(ArrayList<ArrayList<Edge>> graph) {
        boolean[] vis = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (Edge e : graph.get(curr)) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 6; // vertices 0..5
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        createGraph(graph, v);

        System.out.println("BFS traversal:");
        bfs(graph);
    }
}