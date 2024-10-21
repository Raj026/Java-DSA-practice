package Striver;

import java.util.Arrays;
import java.util.Collections;

public class rotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(arr);
        reverse(arr);
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }

    public static int[][] transpose(int[][] arr){
        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static int[][] reverse(int[][] arr){

        for(int i=0;i< arr.length;i++){
            int low=0, high = arr.length-1;
            while(low<high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }

        return arr;
    }


}
