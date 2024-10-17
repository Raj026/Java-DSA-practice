package Striver;

import java.util.Arrays;

public class sortedPairs {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0, j = arr.length - 1;

        while(i<=j) {
            int k = arr[i];
            while(j != -k) {
                j--;
                if(arr[j] < -k){
                    i++;
                    break;
                }
                if(j==-k){
                    System.out.println(k);
                }
            }
        }
    }
}
