package QueuesAndStacks;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

class MinStack{
    Stack<Integer> st = new Stack<>();

    int min_val;

    public MinStack(){
        min_val = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            min_val = x;
        }
        else if(x < min_val){
            min_val = x;
        }

    }

    public void pop() {
        if(!st.isEmpty()){
            int el = st.pop();
            if(min_val > el) {

            }
        }
    }
}

public class ImplementMinStack {
    public static void main(String[] args) {

    }
}
