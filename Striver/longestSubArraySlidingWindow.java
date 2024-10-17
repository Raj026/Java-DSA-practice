package Striver;

public class longestSubArraySlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int n = arr.length;

        int l = 0, r=0, sum = 0, max_len = 0;
        int k = 13;

        while(r<n){
            sum += arr[r];

            while (sum > k){
                sum -= arr[l];
                l++;
            }
            if(sum<=k) {
                max_len = Math.max(max_len, (r-l+1));
                r++;

            }


        }

        System.out.println(max_len);
    }
}
