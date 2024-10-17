package LCproblems;

import java.util.ArrayList;
import java.util.List;

public class MakeSumDivisibleByP {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        int n = arr.length;
        int sum = 0, p = 7;
        for(int i:arr){
            sum += i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        if(sum % p==0){
            System.out.println("Divisible by the P no need to minimize the array");
        }
        else {
            for(int i=0;i<n-1;i++){
                List<Integer> res = new ArrayList<>();
                sum -= arr[i];
                if(sum %p == 0) {
                    res.add(arr[i]);
                    ans.add(res);
                    break;
                }
                for(int j=i+1;j<n;j++) {
                    sum -= arr[j];
                    if(sum %p==0){
                        res.add(arr[j]);
                        break;
                    }
                }

                ans.add(res);
            }

            System.out.println(ans);
        }
    }
}
