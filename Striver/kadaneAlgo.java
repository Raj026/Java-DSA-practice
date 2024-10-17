package Striver;

public class kadaneAlgo {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, -7, 2, 3};
        int[] arr = {2, -7 ,5,6,3,-1};
        int sum = 0;
//        int max_sum = 0;

//        for(int i:arr) {
//            sum += i;
//
//            if(sum < 0) {
//                sum = 0;
//            }
//            else {
//                max_sum = Math.max(max_sum, sum);
//            }
//        }
        int curr = arr[0];
        int max_sum = curr;
        int start = 0,end = 0, temp_start = 0;

        for(int i = 1;i<arr.length;i++) {
            if(arr[i] > curr + arr[i]) {
                curr = arr[i];
                temp_start = i;
            }
            else {
                curr += arr[i];
            }

            if(curr > max_sum) {
                max_sum = curr;
                start = temp_start;
                end = i;
            }
        }
//
        System.out.println(start + " " +end);;
    }
}
