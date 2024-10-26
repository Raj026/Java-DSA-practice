package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumI {
    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(3,1,2);
        //OP- [6, 4, 5, 3, 3, 1, 2, 0]
        int n = res.size();

//        int p = (int) Math.pow(2,n);
        List<Integer> a = new ArrayList<>();
        helper(res, 0, 0, n, a);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }

    public static void helper(List<Integer> r, int index, int sum, int n, List<Integer> sumSubset ){
        if(index==n){
            sumSubset.add(sum);
            return;
        }

        //pick the element
        helper(r, index + 1, sum + r.get(index), n, sumSubset);

        //not pick the element
        helper(r, index+1, sum, n, sumSubset);
    }
}
