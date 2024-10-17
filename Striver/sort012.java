package Striver;

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,2,2,0};

        int n = arr.length;
        int i= 0, j = 0,k = n-1;

        while(j<=k) {
            if(arr[j] == 2) {
                swap(arr, j, k);
                k--;
            } else if (arr[j]== 1) {
                j++;
            }

            else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
