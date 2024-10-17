package Striver;

import java.util.HashMap;

public class longestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;

        int max_len = Integer.MIN_VALUE;
        HashMap<Integer, Integer> res = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<n;i++) {
            sum += arr[i];
            if(sum == 0) {
                max_len = i+ 1;
            }
            else{
                if(res.get(sum) != null) {
                    max_len = Math.max(max_len, i - res.get(sum));
                }
                else{
                    res.put(sum, i);
                }
            }
        }

        System.out.println(res);

//        for(int i =0;i<n;i++) {
//            int sum = 0;
//            for(int j=i;j<n;j++) {
//                sum += arr[j];
//                if(sum==0) {
//                    max_len = Math.max(max_len, j - i + 1);
//                }
//            }
//        }

        System.out.println(max_len);
    }
}
