package SlidingWindoAndTwoPointer;

import java.util.HashSet;
import java.util.Set;

public class fruitsIntoBasket {
    public static void main(String[] args) {
        int[] arr = {3,3,3,1,2,1,1,1,2,3,3,4};
        int n = arr.length;
        int count = 0;
        int max_len = Integer.MIN_VALUE;

        for(int i = 0;i<n-1;i++) {
            Set<Integer> res = new HashSet<>();
            res.add(arr[i]);
            count = 0;
            for(int j=i;j<n;j++){
                if(res.contains(arr[j])){
                    count++;
                    max_len = Math.max(max_len, count);
                } else if (!res.contains(arr[j]) && res.size() < 2) {
                    res.add(arr[j]);
                    count++;
                    max_len = Math.max(max_len, count);
                } else  {
                    count = 0;
                    break;
                }
            }
        }

        System.out.println(max_len);
    }
}
