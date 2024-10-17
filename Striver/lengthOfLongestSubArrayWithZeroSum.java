package Striver;

public class lengthOfLongestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = arr.length;
        int max_len = 0;

        for(int i=0;i<n-1;i++){
            int sum = arr[i];
            for(int j=i+1;j<n;j++){
                sum += arr[j];
                if(sum == 0){
                    max_len = Math.max(max_len, j-i+1);
                }
            }
        }

        System.out.println(max_len);
    }
}
