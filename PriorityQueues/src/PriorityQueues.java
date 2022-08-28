import javax.print.attribute.standard.PrinterResolution;
import java.util.Iterator;
import java.util.Optional;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue();
        pqueue.add(3);
        pqueue.add(2);
        pqueue.add(4);
        pqueue.add(1);
        System.out.println(pqueue);

        PriorityQueue<String> pqueue2 = new PriorityQueue();
        pqueue2.add("Rocky");
        pqueue2.add("Dog");
        pqueue2.add("Abstract");
        System.out.println(pqueue2);

        //peek method returns the first element.
        System.out.println(pqueue.peek());

        //poll method removes and returns the first element
        pqueue.poll();
        System.out.println(pqueue);

        //Iterating the priority queue
        Iterator iterator = pqueue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object[] arr = pqueue2.toArray();
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(10);
        queue.add(8);
        queue.add(17);
        queue.add(1);
        queue.add(3);
        Iterator<Integer> iterator1 = queue.iterator();
        while(iterator1.hasNext()) {
            System.out.print(" "+iterator1.next());
        }
        Iterator<Integer> iterator2 = queue.iterator();
        System.out.println("After polling");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }
}
