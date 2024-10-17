package Striver;

public class minimumCardsToObtain {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int n = arr.length;

        int max_sum = Integer.MIN_VALUE;
        int k = 4;

        int left_sum = 0, right_sum = 0;
        for(int i= 0;i<k;i++) {
            left_sum += arr[i];
        }
        max_sum = left_sum;
        int right_index = n-1;
        for(int i = k-1;i>= 0;i--){
            left_sum -= arr[i];
            right_sum += arr[right_index--];
            max_sum = Math.max(max_sum, left_sum +right_sum);
        }




        System.out.println(max_sum);
        System.out.println(right_sum);




    }
}
