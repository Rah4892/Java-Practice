public class InsertInSortedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void printList(InsertInSortedList list) {
       Node curr_node = list.head;
        System.out.println("");
        while(curr_node != null) {

            System.out.print(curr_node.data +" ");
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        InsertInSortedList list = new InsertInSortedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(6);
        printList(list);
        sortedInsert(list, 4);
        printList(list);
    }

    static void sortedInsert(InsertInSortedList list, int data) {
        Node curr_node = list.head;
        Node new_node = new Node(data);
        while(curr_node!=null) {
            if(curr_node.data < data && curr_node.next.data > data) {
                new_node.next = curr_node.next;
                curr_node.next = new_node;
                break;
            }
            else{
                curr_node = curr_node.next;
            }
        }
    }
}
