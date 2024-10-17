import java.util.ArrayList;
import java.util.Arrays;

public class ArraySeries4 {
    public static void main(String[] args) {
       int[] arr = new int[1000];
       arr[0] = 1;

       int size = 1;
       for(int mult = 2;mult<=5;mult++) {
           multiply(arr,size,mult);
       }
        System.out.println(Arrays.toString(arr));


       ArrayList<Integer> res = new ArrayList<>();
       for(int i= size-1; i>=0 ;i--) {
            res.add(arr[i]);
       }

       System.out.println(res);


    }

    private static void multiply(int[] arr, int size, int mult) {
        int carry = 0;
        for(int i=0;i<size;i++) {
            int result = (mult * arr[i]) + carry;

            arr[i] = result % 10;

            carry = result / 10;
        }

        while(carry>0) {
            arr[size] = carry % 10;
            size++;

            carry /= 10;
        }
    }


}
