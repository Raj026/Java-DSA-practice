package BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeCreationGFG {

    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(2,3,4,5,6);
        Node r = new Node(1);
        createNode(r, res);

        printTree(r);
//        System.out.println(r.data);
    }
    public static void createNode(Node root, List<Integer> arr) {
        root.left = new Node(arr.get(0));
        root.right = new Node(arr.get(1));
        root.left.left = new Node(arr.get(2));
        root.left.right = new Node(arr.get(3));
        root.right.left = new Node(arr.get(4));

    }

    public static void printTree(Node root) {
        if (root != null) {
            System.out.println(root.data);
            if (root.left != null) System.out.println("Left: " + root.left.data);
            if (root.right != null) System.out.println("Right: " + root.right.data);
            if (root.left != null && root.left.left != null) System.out.println("Left.Left: " + root.left.left.data);
            if (root.left != null && root.left.right != null) System.out.println("Left.Right: " + root.left.right.data);
            if (root.right != null && root.right.left != null) System.out.println("Right.Left: " + root.right.left.data);
        }
    }
}
