import java.util.Arrays;

public class secondLargestBrute {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,3,10,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int slarge = 0;
        for(int i=n-2;i>=0;i--){
            if(arr[n-1] != arr[i]){
                slarge = arr[i];
                break;
            }
        }
        System.out.println(slarge);
    }
}
