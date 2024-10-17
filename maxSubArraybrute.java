public class maxSubArraybrute {
    public static void main(String[] args) {
        int[] arr = {-4,5,-8,9,3,-2,1,6};
        int maxim = Integer.MIN_VALUE;
//        Brute Force Approach
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                int sum = 0;
//                for(int k=i;k<j;k++){
//                    sum += arr[k];
//                    maxim = Math.max(sum,maxim);
//
//                }
//            }
//        }

//        Better Approach
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                maxim = Math.max(sum,maxim);
            }
        }
        System.out.println(maxim);
    }
}
