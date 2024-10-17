package BinarySearch;
import java.util.*;
public class nthrootOfNumber {
    public static void main(String[] args) {
        int m = 27;
        int n = 3;

        int low = 1,high = m;
        int ans = 0;

        while(low<=high){
            int mid = (low + high) /2;

            int val = (int) Math.pow(n, mid);
            if(val == m){
                ans = mid;
                break;
            }
            else if(val<m){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
