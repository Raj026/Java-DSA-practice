import java.util.Arrays;

public class countDuplicateopt {
    public static void main(String[] args) {
        int[] arr = {8,9,1,10,22,7,9,8};
        Arrays.sort(arr);
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(i+1);
    }
}
