import java.util.HashMap;
import java.util.Map;

public class containsDup {
    public static void main(String[] args) {
        int[] arr = {1,5,6,1};
        Map<Integer, Integer> mp = new HashMap<>();
        int k = 3;

        for(int i=0;i<arr.length;i++) {
            if(mp.containsKey(arr[i])) {
                int idx = mp.get(arr[i]);
                if(i-idx <= k) {
                    System.out.println(arr[i]);
                }

            }
            else {
                mp.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> m:mp.entrySet()) {
            System.out.println(m);
        }
    }
}
