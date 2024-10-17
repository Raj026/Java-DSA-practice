package Striver;

import java.util.ArrayList;

public class countInversions {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,4};
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0;i<n-1;i++) {
            int left = arr[i];
            for(int j = i+1;j<n;j++) {
                if(left>arr[j]){
                    ArrayList<Integer> k = new ArrayList<>();
                    k.add(left);
                    k.add(arr[j]);
                    res.add(k);
                }

            }
        }

        System.out.println(res);
    }
}
