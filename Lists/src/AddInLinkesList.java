public class AddInLinkesList {

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
        AddInLinkesList list1 = new AddInLinkesList();
        list1.head = new Node(5);
        list1.head.next = new Node(6);
        list1.head.next.next = new Node(3);

        AddInLinkesList list2 = new AddInLinkesList();
        list2.head = new Node(8);
        list2.head.next = new Node(4);
        list2.head.next.next = new Node(2);


    }
}
