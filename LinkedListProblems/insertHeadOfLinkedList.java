package LinkedListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node{
    public int data;
    public Node next;

    public Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    public Node(int data1){
        data = data1;
        next = null;
    }
}

public class insertHeadOfLinkedList {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>(Arrays.asList(1,2,3));
        int val = 100;

        Node head = new Node(res.get(0));
        head.next = new Node(res.get(1));
        head.next.next = new Node(res.get(2));
        head.next.next.next = null;

        head = insertHead(head, val);

        printLL(head);
    }

    public static Node insertHead(Node h, int val){
        Node temp = new Node(val, h);
        return temp;
    }

    public static void printLL(Node head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }


}
