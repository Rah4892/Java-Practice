package Trees;

public class PreOrderWithStack {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorderWithStack(root);
    }

    private static void preorderWithStack(Node root) {

    }
}
