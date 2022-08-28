import java.util.Stack;

public class ReverseList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void printList(ReverseList list) {
        Node curr_node = list.head;
        System.out.println();
        while(curr_node != null) {
            System.out.print(curr_node.data +" ");
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        printList(list);
        reverseList(list);
        printList(list);
    }

    static void reverseList(ReverseList list) {
        Node curr_node = list.head;
        Stack<Node> stack = new Stack<>();
        while(curr_node.next != null){
            stack.push(curr_node);
            curr_node = curr_node.next;
        }
        list.head = curr_node;
        while(!stack.isEmpty()) {
            curr_node.next = stack.peek();
            stack.pop();
            curr_node = curr_node.next;
        }
        curr_node.next = null;
    }
}
