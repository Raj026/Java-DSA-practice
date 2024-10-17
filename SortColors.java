import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,1,1,0,2};
        int i = 0, j = 0;
        int k = arr.length-1;

        while(j<=k) {
            if(arr[j] == 1) {
                j++;
            }
            else if(arr[j] == 2) {
                swap(arr, j, k);
                k--;
            }
            else {
                swap(arr, j, i);
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
