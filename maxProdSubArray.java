public class maxProdSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod = 1;
            for(int j=i;j<n;j++) {
                prod *= arr[j];
                max = Math.max(max,prod);
            }
        }
        System.out.println(max);
    }
}
