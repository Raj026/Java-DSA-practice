package SlidingWindoAndTwoPointer;

public class countNiceSubArrays {
    //Similar to the binarySubarray sum just convert the odd and even to 0's and 1's
    public static void main(String[] args) {
        int[] arr = { 2,2,2,1,2,2,1,2,2,2};
        int k = 2;

        int n = arr.length;

        for(int i = 0;i<n;i++) {
            arr[i] = (arr[i] % 2 == 0) ? 0 : 1;
        }

        int atMost = Helper(arr, k);
        int atMost_minus = Helper(arr, k-1);

        System.out.println(atMost-atMost_minus);

    }

    public static int Helper(int[] arr, int goal){
        if(goal<0) return 0;
        int sum = 0;
        int l = 0,count = 0;
        for(int i = 0;i<arr.length;i++) {
            sum += arr[i];

            while(sum > goal){
                sum -= arr[l];
                l++;
            }
            count += (i-l+1);
        }

        return count;
    }
}
