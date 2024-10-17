package Striver;

public class binarySearchp1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = arr.length;

        int start = 0, end = n-1;
        int target=9;

        for(int i=0;i<n;i++) {
            int mid = (start + end) / 2;
            if(arr[mid]== target) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
    }
}
