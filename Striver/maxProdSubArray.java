package Striver;

public class maxProdSubArray {
    public static void main(String[] args) {
        int max_prod = 1;
        int[] arr = {1,2,-3,0,-4,-5};
//        for(int i=0;i<arr.length-1;i++) {
//            int p = arr[i];
//            for(int j=i+1;j<arr.length;j++) {
//                p *= arr[j];
//                max_prod = Math.max(max_prod, p);
//            }
//        }
        int pre = 1, suff = 1;
        int ans = 0;
        for(int i = 0;i<arr.length;i++) {
            //For handling the zero case , we assign the value to 1.
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;

            pre *= arr[i];
            suff *= arr[arr.length - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }

        System.out.println(ans);

//        System.out.println(max_prod);
    }
}
