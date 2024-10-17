package BinarySearch;

public class smallestDivisor {
    public static int divisor(int[] arr, int mid) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++) {
            sum += (int) Math.ceil((double) arr[i] / mid);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int limit = 8;
        int max_number = Integer.MIN_VALUE;
        int low = 1, high = max_number;

        for(int i:arr){
            high = Math.max(max_number, i);
        }

        while(low<=high){
            int mid = (low + high)/2;

            if(divisor(arr,mid) <= limit){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(low);
//        System.out.println(high);
//        System.out.println(n);
    }
}
