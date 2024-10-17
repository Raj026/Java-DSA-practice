import java.util.Arrays;

public class moveZerosBrute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,0,6,0,9};
        int count = 0;
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
            else{
                count++;
            }
        }
        int n = arr.length;
        for(int i=n-count;i<n;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
    }

}
