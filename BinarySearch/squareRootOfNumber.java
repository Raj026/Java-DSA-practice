package BinarySearch;

public class squareRootOfNumber {
    public static void main(String[] args) {
        int k = 6;

        int low = 1;
        int high = k;
        int ans = 0;
        while(low<=high){
            int mid = (low +high) / 2;

            if(mid * mid <= k){
                low = mid+1;
                ans = mid;
            }
            else{
                high = mid-1;
            }
//            System.out.println(mid);
        }

        System.out.println(ans);


    }
}
