import java.util.HashSet;
import java.util.Set;

public class RemoveLoop {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        RemoveLoop list = new RemoveLoop();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        //list.head.next.next.next.next = list.head.next;
        System.out.println(removeLoop(list));
    }

    static boolean removeLoop(RemoveLoop list) {
        Node curr_node = list.head;
        Node prev_node = null;
        Set<Integer> set = new HashSet<>();
        while(curr_node != null) {
            if(set.contains(curr_node.data)) {
                prev_node.next = null;
                return true;
            }
            else{
                set.add(curr_node.data);
                prev_node = curr_node;
                curr_node = curr_node.next;
            }
        }
        return false;
    }

}
