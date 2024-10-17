package QueuesAndStacks;

public class StackUsingFunctionArrays {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(6);
        st.push(7);
        System.out.println(st.pop());
    }
}

class Stack{
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;
    void push(int x){
        top++;
        arr[top] = x;

    }
    int peek(){
        if(top==-1) {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        return arr[top];
    }

    int pop(){
        if(top==-1) {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        int x = arr[top];
        top--;
        return x;
    }
    int size() {
        return top + 1;
    }

}
