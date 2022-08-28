public class BinaryTree1 {
    //creating a Node structure to hold the key and children
    static class Node{
        int key;
        Node left,right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    //creating a root of the tree which is of type Node
    Node root;
    BinaryTree1(int key) {
        root = new Node(key);
    }
    BinaryTree1() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        //on every insertion in the Binary tree we will create a Node and then add to the root
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

    }
}
