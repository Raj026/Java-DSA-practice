package Striver;

import java.util.Arrays;

public class nextPerm {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,2};
        int breakpoint = 0;

        int n = arr.length;
        for(int i=n-2;i>=0;i--) {
            if(arr[i] >= arr[i+1]){
                continue;
            }
            else{
                breakpoint = i;
                break;
            }
        }

        for(int i=n-1;i>breakpoint;i--) {
            if(arr[i] > arr[breakpoint]) {
                swap(arr, i, breakpoint);
                break;
            }
        }

        reverse(arr, breakpoint + 1, n-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(breakpoint);

//        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int s, int e) {
        while(s<=e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
