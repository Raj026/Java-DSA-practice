import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++) {
            if(arr[arr[i] - 1] > 0) {
                arr[i] = arr[arr[i] - 1] * -1;
            }
            else{
                res[0] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                res[1] = (i+1);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
//        HashSet<Integer> set = new HashSet<>();
//        int[] rex = new int[2];
//
//        int n = arr.length;
//        int currSum = 0;
//        int sum = n * (n+1) /2;
////        System.out.println(sum);
//        for(int i:arr) {
//            if(set.contains(i)){
//                rex[0] = i;
//            }
//            else{
//                set.add(i);
//                currSum += i;
//            }
//
//            System.out.println(currSum);
//
//        }
//
//        rex[1] = sum - currSum;
    }
}
