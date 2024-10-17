import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class twoSumOpt {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,2,10};
        int target = 17;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
//            int more = target - arr[left];
            if(arr[left] + arr[right] < target){
                left++;
            }
            else if(arr[left] + arr[right] > target){
                right--;
            }
            else{
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(left + " " + right);
//        int[] a = new int[2];
//        int target = 11;
//
//        HashMap<Integer, Integer> res = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int more = target - arr[i];
//            if(res.containsKey(more)){
//                a[0] = res.get(more);
//                a[1] = i;
//            }
//            res.put(arr[i],i);
//        }
//        System.out.println(Arrays.toString(a));
    }
}
