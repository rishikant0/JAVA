import java.util.*;

public class BrokenBFS {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    // create graph method
    public static void createGraph(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));
    }

    // BFS method
    static void BFS(int v, ArrayList<Edge>[] graph, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public static void main(String[] args) {

        // 1 --- -- 3
        // / \
        // 0 5
        // \ /
        // 2---------- 4

        // 7
        // / \
        // 6 9
        // \ /
        // 8

        int v = 10; // number of vertices
        ArrayList<Edge>[] Graph = new ArrayList[v];

        createGraph(Graph, v);

        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (vis[i] == false) {
                BFS(v, Graph, vis, i);
            }
        }

    }
}
