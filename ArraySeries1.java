import java.util.Arrays;

public class ArraySeries1 {
    public static void main(String[] args) {
        //Two Sum II (For sorted array)
        int[] arr = {2,7,11,15};
        int n = arr.length;
        int i = 0,j=n-1, target = 9;
        int[] res = new int[2];

        while(i<j) {
            if(arr[i] + arr[j] == target) {
                res[0] = i+1;
                res[1] = j+1;
            }
            if(arr[i] + arr[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
