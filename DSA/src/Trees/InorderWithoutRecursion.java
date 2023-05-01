package Trees;

import java.util.Stack;

public class InorderWithoutRecursion {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorderWithStack(root);
    }

    private static void inorderWithStack(Node root) {
        Stack<Node> stack = new Stack();
        Node currNode = root;
        while (currNode != null || stack.size() > 0) {
            while (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();

            System.out.println("Key=" + currNode.data);

            currNode = currNode.right;

        }
    }
}
