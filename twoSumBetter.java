import java.util.Arrays;
import java.util.HashMap;

public class twoSumBetter {
    public static void main(String[] args) {
        int[] arr = {4,8,2,10,3,6};
        int target = 13;
//        int[] a = new int[2];
        boolean a = false;
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int more = target - arr[i];
            if(res.containsKey(more)){
                a = true;
            }
            res.put(arr[i], i);
        }
        if(a){
            System.out.println("Present");
        }
        else{
            System.out.println("NO pair found");
        }
//        System.out.println(Arrays.toString(a));
    }
}
