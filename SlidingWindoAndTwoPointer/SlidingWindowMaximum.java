package SlidingWindoAndTwoPointer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {4,0,-1,3,5,3,6,8};
        int k = 3, ri = 0;
        int[] res = new int[arr.length -k + 1];
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<arr.length;i++) {
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                res[ri++] = arr[q.peek()];
            }
        }

//        System.out.println(d.peekFirst());

//        int[] res = new int[arr.length];
//
//        int l = 0, r = k-1;
//
//        while(r<arr.length){
//            int max = Integer.MIN_VALUE;
//            for(int i=l;i<=r;i++) {
//                max = Math.max(max, arr[i]);
//            }
//
//
//            if(l==arr.length - k + 1){
//                res[l] = arr[l];
//            }
//            else {
//                res[l] = max;
//            }
//            l++;
//            r++;
//        }
        System.out.println(Arrays.toString(res));
//        System.out.println(l + " " + r);
    }
}
