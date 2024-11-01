package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class subSetSum {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(3,2,1));
        ArrayList<Integer> subSum = new ArrayList<>();
        subSetSumHelper(0, res.size(), 0, res,subSum);
        Collections.sort(subSum);
        System.out.println(subSum);
    }

    public static void subSetSumHelper(int index, int n, int sum, ArrayList<Integer> k, ArrayList<Integer> subSum){
//        ArrayList<Integer> a = new ArrayList<>();
        if(index==n){
            subSum.add(sum);
            return;
        }

        //pick the element for the sum
        subSetSumHelper(index+1, n, sum + k.get(index), k, subSum);

        //not pick the element for the sum

        subSetSumHelper(index+1, n, sum, k, subSum);

    }
}
