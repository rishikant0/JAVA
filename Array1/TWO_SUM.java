import java.util.HashMap;

public class TWO_SUM {

    public static void sum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + "," + i + "]");
                return;
            }

            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,4,3,5,6};
        int target = 7;

        sum(arr, target);
    }
}