import java.util.Arrays;

public class rotateArraysByDplacesOptimal {
    public static void main(String[] args) {
        int[] arr = {7,8,5,1,2,3,6,9};
        int n = arr.length;
        int k = 3;

//        System.out.println(Arrays.toString(reverseArray(arr, 0, k)));
        reverseArray(arr, 0, k);
        reverseArray(arr, k, n);
        System.out.println(Arrays.toString(reverseArray(arr, 0, n)));

    }

    public static int[] reverseArray(int[] arr, int low, int high){
//        int n = arr.length;
        int k = high-1;
        while(low<=k){
            int temp = arr[low];
            arr[low] = arr[k];
            arr[k] = temp;
            low++;
            k--;

        }
        return arr;
    }
}
