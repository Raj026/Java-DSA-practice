package Striver;

public class slidingWindowPractice {
    public static void main(String[] args) {
        int[] arr = {1,4,2,-2,6,7,-3,4};
        int l =0, r = 2; // k-1
        int sum = 0;
        int max_sum = 0;

        for(int i = 0;i<=r;i++){
            sum += arr[i];
        }

        while(r<arr.length-1){
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            max_sum = Math.max(sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
