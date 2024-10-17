public class maxSubArrayOptimal {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-2,-1,1,5,-3};
        int n = arr.length;

        int maxim = Integer.MIN_VALUE;
        int sum = -1;
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;

        for(int i=0;i<n;i++){
            if(sum==0){
                start = i;
            }
            sum+=arr[i];


            if(sum < 0){
                sum = 0;
            }
            if(maxim < sum){
                maxim = sum;
                ansStart = start;
                ansEnd = i;
            }
        }
        System.out.println(maxim);
        System.out.println(ansStart);
        System.out.println(ansEnd);
    }
}
