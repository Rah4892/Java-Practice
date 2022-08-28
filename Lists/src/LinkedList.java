public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        //if list is empty
        if(list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;  //if list is not empty then traverse till end of list
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    //Deletion in linked list by key
    public static void deleteNode(LinkedList list, int key) {
        Node currentNode = list.head;
        Node prev = null;

        //Case 1: when the head equals the key to be deleted
        if(currentNode != null && currentNode.data == key) {
            System.out.println("Deleted:" + key);
            list.head = currentNode.next;
            return;
        }

        // Case 2: when the key is in another node other than the head
        while(currentNode != null) {
            if (currentNode.next == null) {
                System.out.println("Key not found");
                return;
            }
            else if(currentNode.data == key) {
                prev.next = currentNode.next;
                System.out.println("Deleted:" + key);
                return;
            }
            else {
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public static void printList(LinkedList list) {
        Node current_node = list.head;
        while(current_node != null) {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        printList(list);
        deleteNode(list, 3);
        printList(list);
    }
}
