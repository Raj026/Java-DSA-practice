public class missingNumberOpt1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = 6;
//        int sum = n * (n+1) / 2;
//        int s2 = 0;
//        for(int i = 0;i<n-1;i++){
//            s2 += arr[i];
//        }
//        System.out.println(sum-s2);

        //XOR
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0;i<n-1;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        System.out.println(xor1 ^ xor2);

    }
}
