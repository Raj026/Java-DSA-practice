package Striver;

public class lowerrBoundBS {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int n = arr.length;

        int start = 0, end = n-1;
        int target = 9;
        int ans= 0;

        while(start<=end) {
            int mid = (start + end)/2;

            if(arr[mid] >= target) {
                ans = mid;
//                System.out.println(mid);
//                break;
                end = mid-1;
            }

            else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
        System.out.println(n);
    }
}
