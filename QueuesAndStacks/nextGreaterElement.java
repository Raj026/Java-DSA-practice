package QueuesAndStacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
//        int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] arr = {1,2,3,4,3};
        int n = arr.length;

        int max =Integer.MIN_VALUE;

        for(int i:arr) {
            if(i> max){
                max = i;
            }
        }

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i=n-1;i>=0;i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();

            }

            if(st.isEmpty() && i == n-1){
                res[i] = max;
            }
            else if (st.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);


        }

        System.out.println(Arrays.toString(res));
        System.out.println(n);
    }
}
