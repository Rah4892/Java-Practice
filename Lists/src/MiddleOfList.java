public class MiddleOfList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data=d;
            next=null;
        }
    }
    static void insert(MiddleOfList list, int d) {
        Node new_node = new Node(d);
        new_node.next = null;

        if(list.head == null) {
            list.head = new_node;
        }
        else{
            Node last = list.head;  //if list is not empty then traverse till end of list
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

    }

    static void printList(MiddleOfList list) {
        Node curr_node = list.head;
        while(curr_node != null) {
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }

    }

    static int findMiddle(MiddleOfList list) {
        Node slow_ptr = list.head;
        Node fast_ptr = list.head;

        while(fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        return slow_ptr.data;
    }
    public static void main(String[] args) {
        MiddleOfList list = new MiddleOfList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);

        printList(list);
        System.out.println("Middle:"+findMiddle(list));
    }
}
