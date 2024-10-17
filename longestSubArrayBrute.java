public class longestSubArrayBrute {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,9,11,6};
        int len = 0;
        for(int i= 0;i<arr.length;i++){
            for(int j= i;j< arr.length;j++){
                int sum = 0;
                for(int k = i;k<j;k++){
                    sum += arr[k];
                    if(sum==k) len = Math.max(len, j-i + 1);
                }
            }
        }
        System.out.println(len);
    }
}
