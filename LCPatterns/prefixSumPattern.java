package LCPatterns;

import java.util.Arrays;

public class prefixSumPattern {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int n = arr.length;
        int k = 2;

        int sum = arr[0];
        for(int i=1;i<n;i++){
            sum += arr[i];
            arr[i] = sum;
        }
        int cnt = 0;
        for(int i =n-1;i>=0;i--){
            if(arr[i]>=k){
                cnt++;
            }
        }

        System.out.println(cnt);
//        System.out.println(arr[j] - arr[k-1]);

        System.out.println(Arrays.toString(arr));
    }
}
