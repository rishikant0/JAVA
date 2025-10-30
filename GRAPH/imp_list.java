import java.util.*;
import java.util.ArrayList;

public class imp_list {
    public static void main(String[] args) {
        int v = 3;
        int e = 3;
        // adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= v; i++)
            adj.add(new ArrayList<Integer>());

        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        for (int i = 1; i <= v; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
