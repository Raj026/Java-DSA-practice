package SlidingWindoAndTwoPointer;

import java.util.HashSet;
import java.util.Set;

public class subArrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        int k = 3;
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            Set<Integer> st = new HashSet<>();
            st.add(arr[i]);
            for(int j=i+1;j<n;j++){
//                st.add(arr[j]);
                if(st.contains(arr[j])){
                    break;
                }
                st.add(arr[j]);
                if (st.size() == k) {
                    cnt++;
                    break;
                }

            }
        }

        System.out.println(cnt);
    }
}
