package BinaryTrees;

class Node{
    int data;

    Node right;

    Node left;

    public Node(int key) {
        data = key;

        left = null;

        right = null;
    }
}

public class BinaryTreeRepresentation {
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(7);

        System.out.println(node.toString());
    }
}




