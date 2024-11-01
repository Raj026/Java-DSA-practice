package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsLC77 {
    public static void main(String[] args) {
        int n = 1, k=1;
        List<List<Integer>> ans = new ArrayList<>();
        if(n==1){
            ans.add(new ArrayList<>(Arrays.asList(1)));
        }
        while(n>0){
            int l = n-1;
            for(int i = l;i>=1;i--){
                List<Integer> res = new ArrayList<>();
                res.add(n);
                while(res.size() != k){
                    res.add(l--);
                }
                ans.add(res);
            }
            n--;
        }
        System.out.println(ans);
    }
}
