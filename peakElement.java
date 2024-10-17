import java.util.HashMap;
import java.util.Map;

public class peakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;

        int res= peakElem(arr, n);
        System.out.println(res);

    }

    public static int peakElem(int[] arr, int n) {
        int peak = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,6);
        for(Map.Entry<Integer,Integer> k: mp.entrySet()) {
            System.out.println(k.getValue());
//            System.out.println(k.get);
        }
        for(int i=1;i<n;i++) {
            if(i==n-1) {
                if(arr[i] > arr[i-1]) {
                    return 1;
                }
            }

            else{
                if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                    return 1;
                }
            }
        }

        return 0;
    }
}
