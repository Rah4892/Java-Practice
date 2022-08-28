public class LoopInList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void printList(LoopInList list) {
        Node curr_Node = list.head;
        while(curr_Node.next != null) {
            System.out.println(curr_Node.data+" ");
            curr_Node = curr_Node.next;
        }
    }

    static boolean checkLoop(LoopInList list) {
        Node slow_ptr, fast_ptr ;
        slow_ptr = list.head;
        fast_ptr = list.head;
        boolean isLoop = false;
        if (list.head.next == null) {
            isLoop = false;
        }
        else {
            while (fast_ptr.next.next != null && slow_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
                if(slow_ptr == fast_ptr) {
                    isLoop = true;
                    break;
                }
            }
        }
        return isLoop;
    }

    public static void main(String[] args) {
        LoopInList list = new LoopInList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next = list.head;    //introducing loop

        System.out.println(checkLoop(list));
    }
}
