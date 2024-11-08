package InterviewProblems;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int n = arr.length;

        int i = 0,j=0,k = n-1;

        while (j<=k){
            if(arr[j]==1){
                j++;
            }
            else if(arr[j]==0){
                swap(i, j, arr);
                i++;
                j++;
            }
            else{
                swap(j,k, arr);
                k--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
