public class PartitionLists {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static void printList(PartitionLists list) {
        Node curr_node = list.head;
        while(curr_node != null) {
            System.out.println(curr_node.data);
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        PartitionLists list1 = new PartitionLists();
        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);
        list1.head.next.next.next = new Node(4);
        list1.head.next.next.next.next = new Node(5);

    }
}
