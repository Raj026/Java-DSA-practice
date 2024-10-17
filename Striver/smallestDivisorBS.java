package Striver;

public class smallestDivisorBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int sum = 0, limit = 8;
//        for(int i: arr) {
//            int k = (int) Math.ceil((double) i / 2);
//            System.out.println(k);
//            sum += k;
//        }

        int divisor = 1,ans = 0;
        boolean found = false;
        while(divisor != 5) {
            for(int i=0;i<n;i++) {
                sum+= (int) Math.ceil((double) arr[i] / divisor);

                if(sum > limit) {
                    divisor++;
                    sum = 0;
                    break;
                } else if (i==n-1 && sum<=limit) {
                    ans = divisor;
                    found = true;
                    break;
                }

            }
            if(found) {
                break;
            }

        }


        System.out.println(ans);

    }
}
