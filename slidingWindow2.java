public class slidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int n = arr.length;
        System.out.println(n);
        int k = 14;
        int l=0, r =0 , max_len = Integer.MIN_VALUE;
        int sum =0;
        while(r<n) {
            sum += arr[r];
            while(sum > k) {
                sum -= arr[l];
                l++;
            }
            if(sum <= k) {
//                sum += arr[r];
                max_len = Math.max(max_len, r-l+1);
                r++;
            }

        }
        System.out.println(max_len);
    }
}
