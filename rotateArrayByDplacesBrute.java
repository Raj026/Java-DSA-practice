import java.util.Arrays;

public class rotateArrayByDplacesBrute {
    public static void main(String[] args) {
        int[] arr = {4,8,1,2,9,10,3};
        int d = 3;
        int[] res = new int[3];
        for(int i=0;i<d;i++){
            res[i] = arr[i];
        }

        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        int k = 0;
        for(int i = d+1;i< arr.length;i++){
            arr[i] = res[k++];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
