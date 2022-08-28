public class DeleteAtPos {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void insert(DeleteAtPos list, int data) {
        Node curr_node = new Node(data);
        curr_node.next = null;
         if(list.head == null) {
             list.head = curr_node;
         }
         else {
             Node last_node = list.head;
             while(last_node.next != null) {
                 last_node = last_node.next;
             }
             last_node.next = curr_node;
         }
    }

    static void delete(DeleteAtPos list, int pos) {
        int count = 1;
        Node curr_node = list.head;
        if (pos == 1) {

        }
        while(curr_node.next != null) {
            if (count == pos-1) {
                curr_node.next = curr_node.next.next;
                return;
            }
            else {
                curr_node = curr_node.next;
                count++;
            }
        }
    }

    static void printList(DeleteAtPos list) {
        Node curr_node = list.head;
        while(curr_node != null) {
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        DeleteAtPos list = new DeleteAtPos();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        printList(list);
        delete(list, 2);
        System.out.println();
        printList(list);
    }
}
