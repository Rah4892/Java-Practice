public class DuplicateInList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void removeDuplicates(DuplicateInList list) {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = list.head;

        while(ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while(ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    static void printList(DuplicateInList list) {
        Node curr_node = list.head;
        while(curr_node != null) {
            //System.out.println();
            System.out.print(curr_node.data +" ");
            curr_node = curr_node.next;
        }
    }
    public static void main(String[] args) {
        DuplicateInList list = new DuplicateInList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(25);
        list.head.next.next.next = new Node(10);
        list.head.next.next.next.next = new Node(30);
        list.head.next.next.next.next.next = new Node(20);
        list.printList(list);
        removeDuplicates(list);
        System.out.println();
        list.printList(list);
    }
}
