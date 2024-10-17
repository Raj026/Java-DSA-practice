import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySeries2 {
    public static void main(String[] args) {
        //3 Sum
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0;i<n-2;i++) {
            if(i==0 || (i>0 && arr[i]!=arr[i-1])) {
                int low = i+1, high = n-1, sum = 0 - arr[i];

                while(low<high) {
                    if(arr[low] + arr[high] > sum) {
                        high--;
                    }
                    else if(arr[low] + arr[high] < sum) {
                        low++;
                    }
                    else {
                        res.add(Arrays.asList(arr[low], arr[high], arr[i]));
//                        To avoid duplicates
                        while(low<high && arr[low] == arr[low+1]) low++;
                        while(low <high && arr[high] == arr[high-1]) high--;

                        low++;
                        high--;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
