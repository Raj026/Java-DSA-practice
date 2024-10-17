package QueuesAndStacks;

import java.util.ArrayList;
import java.util.Scanner;

public class StackUsingArrays {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();

        int top = -1;
        Scanner sc = new Scanner(System.in);


        boolean flag = true;

        while(flag) {
            System.out.println("Enter the operation you want to perform: ");
            System.out.println("1. Push  2. Pop  3. Peek 4. Exit");

            int k = sc.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Enter the number you want to push: ");
                    int l = sc.nextInt();
                    res.add(l);
                    top++;
                    break;
                case 2:
                    if(top==-1) {
                        System.out.println("Stack UnderFlow");
                        break;
                    }
                    int o = res.get(top);
                    System.out.println("The number popped is : "+ o);
                    top--;
                    break;
                case 3:

                    System.out.println("Currently the top element is "+ res.get(top));
                    break;
                case 4:
                    flag = false;
                    System.out.println("Exited");
                    break;
            }
        }





    }
}
