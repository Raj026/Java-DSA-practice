
import java.util.Arrays;

public class findPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int sum = 0;
        for(int i=0;i< arr.length;i++) {
            sum += arr[i];
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
//        int[] new_arr = new int[arr.length];
//
//        int sum = 0;
//
//        for(int i = 0;i<arr.length;i++) {
//            sum += arr[i];
//            new_arr[i] = sum ;
//        }
//        System.out.println(sum);
//        int pivot = 0;
//        for(int i=1;i<new_arr.length;i++) {
//            if(new_arr[i-1] == sum - new_arr[i-1] - arr[i]) {
//                // for index 3 => 11  == 28 - 11 - a
//                pivot = i;
//            }
//        }
//        System.out.println(pivot);
//        System.out.println(Arrays.toString(new_arr));
    }
}
