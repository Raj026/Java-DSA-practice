import java.util.*;

public class findOccurence {
    public static void main(String[] args) {
        int[] arr = {4,3,3,1,1,1};
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i:arr){
            res.put(i, res.getOrDefault(i, 0) + 1);
        }
//        System.out.println(res.size());
        int[] ans = new int[res.size()];
        Set<Integer> a = new HashSet<>();
        for(Map.Entry<Integer, Integer> m: res.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());

            a.add(m.getValue());
        }
        int idx = 0;
        for(int k: a) {
            ans[idx++] = k;
        }

        System.out.println(Arrays.toString(ans));

    }
}
