import java.util.Arrays;

public class arrangElemBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int[] res = new int[n];
        int k  = 0;
        int l = 1;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                res[k] = arr[i];
                k += 2;
            }
            else {
                res[l] = arr[i];
                l +=2;
            }
        }
        System.out.println(Arrays.toString(res));

//Brute Force
//        int[] pos = new int[n/2];
//        int[] neg = new int[n/2];
//        int k =0, l=0;
//        for(int i: arr){
//            if(i < 0){
//                neg[k++] = i;
//            }
//            else{
//                pos[l++] = i;
//            }
//        }
//        int[] res = new int[n];
//
//        int m = 0,j=0;
//        for(int i =0;i<n;i++){
//            if(i%2==0){
//                res[i] = pos[m++];
//            }
//            else{
//                res[i] = neg[j++];
//            }
//        }
//        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.toString(pos));
//        System.out.println(Arrays.toString(neg));
    }
}
