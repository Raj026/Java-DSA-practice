package Striver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class twoSum {
    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(5,6,9,2,3,1);

        int target = 5;

//        for(int i = 0;i<res.size() - 1;i++) {
//            int rem = target - res.get(i);
//            for (int j = i + 1; j < res.size(); j++) {
//                if(res.get(j) == rem) {
//                    System.out.println(res.get(i) + " " + res.get(j));
//                }
//            }
//        }

        Collections.sort(res);

        int start = 0,end = res.size() - 1;

        while(start <=end) {
            if(res.get(start) + res.get(end) == target) {
                System.out.println(res.get(start) + " " +res.get(end));
                break;
            } else if (res.get(start) + res.get(end) > target) {
                end--;
            }
            else{
                start++;
            }
        }
    }
}
