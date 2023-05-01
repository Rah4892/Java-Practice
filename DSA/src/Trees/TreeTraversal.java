package Trees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        this.data = d;
        left = right = null;
    }
}
public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder traversal");
        inorderTraversal(root);
        System.out.println("Pre-order traversal");
        prerderTraversal(root);
        System.out.println("Post-order traversal");
        postOrderTraversal(root);

    }

    private static void postOrderTraversal(Node root) {
        if(root == null)
            return ;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println("Key="+root.data);

    }

    private static void prerderTraversal(Node root) {
        if(root == null)
            return;
        System.out.println("Key="+root.data);
        prerderTraversal(root.left);
        prerderTraversal(root.right);
    }

    private static void inorderTraversal(Node root) {
        if(root == null)
            return;

        inorderTraversal(root.left);
        System.out.println("Key="+root.data);
        inorderTraversal(root.right);
    }

}
