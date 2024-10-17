package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        int[] arr = {11 ,2 ,32 ,3 ,41};
        for(int i:arr){
            s.push(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!s.isEmpty()){
            res.add(s.pop());
        }
        System.out.println(s);
        Collections.sort(res);
        Stack<Integer> ans = new Stack<>();

        for(int k:res){
            ans.push(k);
        }
        System.out.println(ans.peek());
    }
}
