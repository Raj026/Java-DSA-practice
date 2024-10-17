package Striver;

public class longestSubarrayCountPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int n = arr.length;

        int max_len = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int k = 6;
        int sum = arr[0];

        while(right < n) {
            while(left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum==k) {
                max_len = Math.max(max_len, right - left + 1);
            }
            right++;
            if(right < n) {

                sum += arr[right];
            }

        }

        System.out.println(max_len);
    }
}
