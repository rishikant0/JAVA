import java.util.ArrayList;

public class No_Of_Provision {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<ArrayList<Edge>> graph, int v) {
        for (int i = 0; i < v; i++) {
        graph.add(new ArrayList<>());
        }

        graph.get(1).add(new Edge(1, 2));
        graph.get(2).add(new Edge(2, 3));
        graph.get(3).add(new Edge(3, 2));
        graph.get(4).add(new Edge(4, 5));
        graph.get(5).add(new Edge(5, 6));
        graph.get(6).add(new Edge(6, 5));
        graph.get(7).add(new Edge(7, 8));
        graph.get(8).add(new Edge(8, 7));
    }

    public static void dfs(int curr, boolean visited[], ArrayList<ArrayList<Edge>> graph) {
        visited[curr] = true;
        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if (!visited[e.dest]) {
                dfs(e.dest, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        int v = 9; // vertices 0 to 8
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        creategraph(graph, v);
        System.out.println("Graph created successfully.");
        boolean visited[] = new boolean[v];
        int count = 0;
        for (int i = 1; i < v; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, visited, graph);
            }
        }
        System.out.println("Number of connected components: " + count);
    }
}