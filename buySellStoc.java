public class buySellStoc {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        int mini = arr[0];
//        int profit = 0;
//
//        for(int i= 1;i<arr.length;i++){
//            int cost = arr[i] - mini;
//            profit = Math.max(profit, cost);
//            mini = Math.min(mini, arr[i]);
//        }

        int mini = Integer.MAX_VALUE;
        int profit = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i] < mini){
                mini = arr[i];
            }
            else if(arr[i] - mini > profit){
                profit = arr[i] - mini;
            }
        }

        System.out.println(profit);
    }
}
