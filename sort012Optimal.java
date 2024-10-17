import java.util.Arrays;

public class sort012Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,1,0,2};
        int low = 0,mid = 0;
        int high  = arr.length - 1;
        //Dutch national Flag algorithm
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;

            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
