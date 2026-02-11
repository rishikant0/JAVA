import java.util.ArrayList;
import java.util.List;

public class KEY_ROOM {

    // DFS helper
    public void dfs(int start, List<List<Integer>> rooms, boolean[] vis) {
        vis[start] = true;
        for (int key : rooms.get(start)) { // iterate over keys in the current room
            if (!vis[key]) {
                dfs(key, rooms, vis);
            }
        }
    }

    // Main function to check if all rooms can be visited
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(0, rooms, vis);

        for (int i = 0; i < rooms.size(); i++) {
            if (!vis[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example: 4 rooms
        List<List<Integer>> rooms = new ArrayList<>();

        // TRUE ANSWER EXAMPLE
        // // Room 0 has key to room 1
        // rooms.add(new ArrayList<>(List.of(1)));
        // // Room 1 has key to room 2
        // rooms.add(new ArrayList<>(List.of(2)));
        // // Room 2 has key to room 3
        // rooms.add(new ArrayList<>(List.of(3)));
        // // Room 3 has no keys
        // rooms.add(new ArrayList<>());

        // OR FOR FALSE ANSWER
        rooms.add(new ArrayList<>(List.of(1, 3))); // room 0
        rooms.add(new ArrayList<>(List.of(3, 0, 1))); // room 1
        rooms.add(new ArrayList<>(List.of(2))); // room 2
        rooms.add(new ArrayList<>(List.of(0)));

        KEY_ROOM solver = new KEY_ROOM();
        boolean result = solver.canVisitAllRooms(rooms);

        System.out.println("Can visit all rooms? " + result);
    }
}
