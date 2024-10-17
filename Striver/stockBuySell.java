package Striver;

public class stockBuySell {
    public static void main(String[] args) {
        int[] arr= {7,6,4,3,1};
        int profit = Integer.MIN_VALUE;
        int max_profit = 0;
        int min_val = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] <min_val) {
                min_val = arr[i];
            }

            profit = arr[i] - min_val;
            max_profit = Math.max(max_profit, profit);
//            System.out.println(profit);
        }

        System.out.println(max_profit);
    }
}
