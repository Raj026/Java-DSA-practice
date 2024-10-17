package Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};
        List<int[]> res = new ArrayList<>();
        int[] currentInterval = arr[0];
        for(int[] k:arr){
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextIntervalStart = k[0];
            int nextIntervalEnd = k[1];
            if(nextIntervalStart < currentEnd) {
                currentEnd = nextIntervalEnd;
                currentInterval[1] = currentEnd;
            }
            else {
                res.add(currentInterval);
                currentInterval = k;
            }
//            System.out.println(nextIntervalStart+ " " +nextIntervalEnd);
//            System.out.println(Arrays.toString(k));
        }

        res.add(currentInterval);
        for (int[] a:res) {
            System.out.println(Arrays.toString(a));
        }

//        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
//
//        System.out.println(Arrays.toString(arr));
    }
}
