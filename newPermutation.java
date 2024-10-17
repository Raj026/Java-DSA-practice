import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class newPermutation {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        int index = -1;

        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }

        if(index==-1){
            Collections.reverse(Arrays.asList(arr));

        }
//        left half already in increasing order
        for(int i=n-1;i>index;i--){
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
