import java.util.Arrays;

public class rotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {4,5,8,6,3,2};
        int n = arr.length;
        int count = 0;
        int firstelem = arr[0];

        for(int i=1; i < n; i++){ //Brute Force Method Applied by Me
            arr[count++] = arr[i];
        }
        arr[n-1] = firstelem;
        System.out.println(Arrays.toString(arr));
    }
}
