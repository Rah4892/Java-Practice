public class FrequencyLinkedList {

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void printList(FrequencyLinkedList list) {
        Node curr_node = list.head;
        System.out.println("");
        while(curr_node != null) {
            System.out.print(curr_node.data +" ");
            curr_node = curr_node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FrequencyLinkedList list = new FrequencyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(4);
        printList(list);
        countFreq(list, 2);
    }

    static void countFreq(FrequencyLinkedList list, int key) {
        int count = 0;
        Node curr_node = list.head;
        while(curr_node != null) {
            if(curr_node.data == key) {
                count++;
            }
            curr_node = curr_node.next;
        }
        System.out.println(count);
    }
}
