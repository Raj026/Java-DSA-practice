package Striver;

public class firstLastOccurBS {
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int n = arr.length;

        int start =0,end = n-1, ans = n;
        int target = 13;
        while(start<=end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target ) {
                end = mid - 1;

            }
            else{
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
