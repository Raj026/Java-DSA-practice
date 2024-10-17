package Striver;

import java.util.Arrays;

public class leftRotateArray {
    public static void main(String[] args) {
        int[] arr= {4,8,2,3};
        int[] new_arr = new int[arr.length];

        int n = arr.length;

        int last = arr[n-1];

        for(int i = n-1;i>=0;i--) {

            if(i==0) {
                arr[i] = last;
            }
            else {
                arr[i] = arr[i-1];
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
