import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println(list);
        list.set(2,17);
        System.out.println(list);
        
        //Iterating through the list
        printList(list);

        //Detecting loop in linked list
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list.add(5);
        list.add(9);
        list.add(3);

    }

    public static void printList(LinkedList<Integer> list) {
        for (Integer x:list) {
            System.out.print(x+" ");
        }
    }

}
