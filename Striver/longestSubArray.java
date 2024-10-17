package Striver;

import java.util.HashMap;
import java.util.Map;

public class longestSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9,2,2,2,2,2};
        int n = arr.length;
        int k = 10, sum = 0;
        int max_len = 0;

        //Hashing
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++) {
            sum += arr[i];
            map.put(i, sum);
//            if(map.get())
        }

        for(Map.Entry<Integer, Integer> res: map.entrySet()) {
//            System.out.println(res.getKey()+  " " + res.getValue());
            System.out.println();
        }
//        Brute force
//        for(int i = 0;i<n;i++) {
//            sum = 0;
//            for(int j = i;j<n;j++) {
//                sum += arr[j];
//                if(sum==k) {
//                    max_len = Math.max(max_len, (j-i) + 1);
//                }
//                else if (sum > k) {
//                    break;
//                }
//
//            }
//        }

        System.out.println(max_len);

//        int start = 0;
//        int max_len = 0;
//        for(int end = 0;end<n;end++) {
//            sum += arr[end];
//
//            while(sum>k && start<=end) {
//                sum -= arr[start];
//                start++;
//            }
//
//            if(sum==k) {
//                max_len = Math.max(max_len, (end-start) + 1);
//            }
//        }
//
//        System.out.println(max_len);

    }
}
