package QueuesAndStacks;

import java.util.Stack;

class MyQueue{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        while(input.empty() == false){
            output.push(input.peek());
            input.pop();
        }

        System.out.println("The element pushed is: "+ x);
        input.push(x);

    }

    public int peek(){
        if(input.isEmpty()){
            System.out.println("Stack Fully Empty");
        }
        return input.peek();
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {

    }
}
