package Striver;

public class upperBoundBS {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};

        int n = arr.length;
        int target = 9;
        int start = 0, end = n-1, ans = n;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] > target) {
                ans = mid;
                end = mid -1;

            }
            else{
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
