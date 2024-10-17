package Striver;

public class countOccurence {
    public static void main(String[] args) {
//        int[] arr = {2,2,3,3,3,3,4};

        int[] arr = {4,5,9,9,9,9,8,8,17,1710,10,10,10,10,10,25};

        int n = arr.length;

        int start = 0, end = n-1;
        int target = 17, ans = n;
        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] >= target){
                ans = mid;
                start = mid + 1;
            }
//            else if (arr[mid] > target){
//                end = mid - 1;
//            }
            else{
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
