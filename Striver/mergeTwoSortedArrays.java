package Striver;

import java.util.Arrays;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,4,8,10};
        int[] arr2 = {2,3,9};

        int m = arr.length;
        int n = arr2.length;

        int i = 0, j = 0;
        int[] res = new int[m+n];
        int idx = 0;

        while(i<m && j<n){
            if(arr[i] <= arr2[j]){
                res[idx++] = arr[i];
                i++;
            }
            else{
                res[idx++] = arr2[j];
                j++;
            }
        }

        while(i<m){
            res[idx++] = arr[i++];
        }

        while(j<n) {
            res[idx++] = arr2[j++];
        }

        System.out.println(Arrays.toString(res));
    }
}
