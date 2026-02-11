import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    public class Pair implements Comparable<Pair> {
        int node;
        int time;

        // Constructor
        Pair(int n, int t) {
            this.node = n;
            this.time = t;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.time != other.time) {
                return this.time - other.time;
            }
            return this.node - other.node;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int t = times[i][2];
            adj.get(u).add(new Pair(v, t));
        }

        int[] ans = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int time = curr.time;

            for (Pair it : adj.get(node)) {
                int totalTime = time + it.time;
                if (totalTime < ans[it.node]) {
                    ans[it.node] = totalTime;
                    pq.add(new Pair(it.node, totalTime));
                }
            }
        }

        int max = -1;
        for (int i = 1; i <= n; i++) {
            if (ans[i] == Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max, ans[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Dijkstra d = new Dijkstra();
        int[][] times = {
                { 2, 1, 1 },
                { 2, 3, 1 },
                { 3, 4, 1 }
        };
        int n = 4;
        int k = 2;
        int result = d.networkDelayTime(times, n, k);
        System.out.println("Network Delay Time: " + result);
    }
}
