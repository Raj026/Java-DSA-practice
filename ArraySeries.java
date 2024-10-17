import java.util.ArrayList;
import java.util.Arrays;

public class ArraySeries {
    public static void main(String[] args) {
        //Trapping Rain water
        // First we will look how to find the left max
        // and right max
        int[] arr = {4,2,0,3,2,5};
        int n = arr.length;
        int[] left_max = getLeftMax(arr, n);
        int[] right_max = getRightMax(arr, n);

        System.out.println(Arrays.toString(left_max));
        System.out.println(Arrays.toString(right_max));
        int h = 0;
        for(int i=0;i<n;i++) {
            h += Math.min(left_max[i], right_max[i]) - arr[i];
        }
        System.out.println(h);
    }

    public static int[] getLeftMax(int[] arr, int n) {
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        return left;
    }

    public static int[] getRightMax(int[] arr, int n) {
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        return right;
    }
}
