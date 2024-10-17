package Striver;

import java.util.Arrays;

public class mergeTwoSortedArraysOptimal {
    public static void main(String[] args) {
        int[] arr = {1,4,8,9};
        int[] arr2 = {2,6,10};

        // here we will set the pointer for arr1 at end and arr2 at start.
        //as both the arrays are sorted we will compare the left pointer to right pointer until the left pointer is greater
        //we will swap the elements of both arrays.

        int left = arr.length - 1;
        int right = 0;

        while(left>=0 && right< arr2.length){
            if(arr[left] > arr2[right]){
                int temp = arr[left];
                arr[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
