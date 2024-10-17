import java.util.Arrays;

public class moveZerosOptimal {
    public static void main(String[] args) {
        int[] arr = {7,8,0,1,0,3,2,0,9};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
        }

        for(int i=j;i<arr.length;i++) {
            arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
//        int j = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                j= i;
//                break;
//            }
//        }
//        for(int i = j+1;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] =temp;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
