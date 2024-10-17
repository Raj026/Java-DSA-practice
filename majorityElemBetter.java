import java.util.HashMap;
import java.util.Map;

public class majorityElemBetter {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 5, 6, 2, 3, 3, 2, 2};
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i) + 1);
            }
            else{
                mp.put(i, 1);
            }

        }
        for(Map.Entry<Integer,Integer> it: mp.entrySet()){
            if(it.getValue() >= (n/2)){
                System.out.println(it.getKey());

            }
        }
    }
}
