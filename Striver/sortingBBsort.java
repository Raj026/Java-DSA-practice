package Striver;

import java.util.Arrays;

public class sortingBBsort {
    public static void main(String[] args) {
        int[] arr = {2,9,3,4,1};

        int n = arr.length, m = n-1;
        boolean changed = false;

        while(m != 0){
            for(int i = 0;i<n-1;i++){
                if(arr[i] > arr[i+1]){
                    swap(i, i+1, arr);
                    changed = true;
                }
            }
            m--;
            if(!changed) break;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
