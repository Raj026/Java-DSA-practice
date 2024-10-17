package Striver;

import java.util.HashSet;

public class slidingWindowConstant {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,1,4,6,2,-2};
        int n = arr.length;
        int k = 4;
        int l = 0, r = k-1;
        int sum = 0;
        for(int i = l;i<=r;i++) {
            sum += arr[i];
        }
        int max_sum = Integer.MIN_VALUE;
        System.out.println(sum);

        //Now as we found the sum of the first window not to find the sum of the next window
        // we will simply subtract the first element and add the new element by incrementing the right index.
        while(r<n-1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            max_sum = Math.max(max_sum, sum);
        }

        System.out.println(max_sum);
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(9);
        s.add(2);
        System.out.println(s.contains(5));
    }
}
