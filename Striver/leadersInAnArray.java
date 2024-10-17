package Striver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        List<Integer> res = new ArrayList<>();
        int n = arr.length -1;
        //optimal solution
        int j = n;
        int max_int = Integer.MIN_VALUE;
        System.out.println(arr[n]);
        while(j!=0) {
            if(arr[j] == n) {
                res.add(arr[j]);
                max_int = arr[j];
            } else if (arr[j] > max_int ) {
                res.add(arr[j]);
                max_int = arr[j];
            }
            j--;
        }
        Collections.reverse(res);

        System.out.println(res);

//        for(int i=0;i<arr.length;i++) {
//            boolean leader = true;
//            for(int j=i+1;j<n;j++) {
//                if(arr[j] > arr[i]) {
//                    leader = false;
//                    break;
//                }
//
//            }
//            if(leader) {
//                res.add(arr[i]);
//            }
//        }
//
//        System.out.println(res);
    }
}
