package Striver;

public class firstAndlastOcc {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,4,6};
        int n = arr.length;
        int target = 3;
        int start = 0, end =n-1;

        int firstOcc = firstOccurrence(arr, start, end, target);
        int lastOcc = lastOccurrence(arr, start, end, target);

        System.out.println(firstOcc);
        System.out.println(lastOcc);
    }

    public static int firstOccurrence(int[] arr, int start, int end,int target){
        int ans = arr.length;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target) {
                ans = mid;
                //now look on the left side hoping to get the least index
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int start, int end, int target) {
        int ans = arr.length;

        while(start<=end){
            int mid = (start + end) /2;

            if(arr[mid]==target) {
                ans = mid;
                //now look on the right hand side hoping to get the max index with the desired target.
                start = mid + 1;
            }
            else if(arr[mid] > target ){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
