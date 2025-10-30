
import java.util.HashMap;

public class main {
    static void hashmapmethod() {
        HashMap<String, Integer> mp = new HashMap<>();
        // Adding elements
        mp.put("rahul", 21);
        mp.put("Mohan", 19);
        mp.put("rishi", 18);
        mp.put("Akash", 20);
        System.out.println(mp.get("rahul"));

        // grtting value of a key from the hashmap
        System.out.println(mp.get("Mohan")); // 19
        System.out.println(mp.get("rahul")); // null

        // remove a pair from the hashmap
        System.out.println(mp.remove("Akash")); // 20
        System.out.println(mp.remove("sohan"));// null

        // chacking if a key is int the hashmap
        System.out.println(mp.containsKey("Akash"));// false
        System.out.println(mp.containsKey("rahul")); // true

        // Adding a new entery only if the new key dosnot exits already
        mp.putIfAbsent("rishu", 20);
        mp.putIfAbsent("rishi", 20);

        // Get all keys in he map //
        System.out.println(mp.keySet()); //

        // Get all value in the map
        System.out.println(mp.values());

        // Get all entries in the hashmap
        System.out.println(mp.entrySet());

        System.out.println("\n");

        for (var keys : mp.keySet()) {
            System.out.printf("\n", keys, mp.get(keys));
        }
    }

    public static void main(String[] args) {
        hashmapmethod();
    }
}
