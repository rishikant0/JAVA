import java.util.PriorityQueue;
import java.util.Arrays;

public class Dijkstra1 {

    class Triplet {
        int row;
        int col;
        int effort;

        public Triplet(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
    }

    public int maxEffectPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);
        }

        ans[0][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);
        pq.add(new Triplet(0, 0, 0));

        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // up, down, left, right

        while (!pq.isEmpty()) {
            Triplet top = pq.poll();
            int row = top.row, col = top.col, effort = top.effort;

            if (row == n - 1 && col == m - 1)
                return effort;

            for (int[] d : dirs) {
                int newRow = row + d[0];
                int newCol = col + d[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int newEffort = Math.max(effort, Math.abs(arr[row][col] - arr[newRow][newCol]));
                    if (newEffort < ans[newRow][newCol]) {
                        ans[newRow][newCol] = newEffort;
                        pq.add(new Triplet(newRow, newCol, newEffort));
                    }
                }
            }
        }

        return ans[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Dijkstra1 d = new Dijkstra1();
        int[][] grid = { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };
        System.out.println(d.maxEffectPath(grid)); //
    }
}