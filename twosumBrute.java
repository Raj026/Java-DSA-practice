import java.util.Arrays;

public class twosumBrute {
    public static void main(String[] args) {
        int[] arr = {4,5,8,3,2,7};
        int target = 11;
        int flag = 0;
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i==j) continue;
                else if(arr[i] + arr[j] == target){
                    res[0] = arr[i];
                    res[1] = arr[j];
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(res));


    }
}
