package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printAllPossibleSubseq {
    public static void main(String[] args) {
        String st = "abc";
        String f ="";
        List<String> res = new ArrayList<>();
        helper(st, f, 0, res);
        System.out.println(res);
        Collections.sort(res);
    }

    public static void helper(String st, String f, int index, List<String> res){
        if(index==st.length()){
            res.add(f);
            return;
        }

        //pick the element and append it to new string.
        helper(st, f+st.charAt(index), index+1, res);

        //not pick the element
        helper(st, f, index+1, res);
    }
}
