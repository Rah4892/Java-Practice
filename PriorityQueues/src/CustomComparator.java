import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class CustomComparator {
    public static void main(String[] args) {
        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int2 - int1;
            }
        };

        PriorityQueue<Integer> queue = new PriorityQueue<>(customComparator);
        queue.add(10);
        queue.add(8);
        queue.add(17);
        queue.add(1);
        queue.add(3);
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(" "+ iterator.next());
        }
        System.out.println();
        while( !queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        //Comparator on String data on the basis of length of string
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                //return str1 .length()- str2.length();
                return str1.compareTo(str2);
            }
        };
        PriorityQueue<String> queue2 = new PriorityQueue<>(comparator);
        queue2.add("Red");
        queue2.add("Orange");
        queue2.add("Five");
        queue2.add("Tweet");
        queue2.add("Lexicography");
        Iterator<String> iterator2 = queue2.iterator();
        while (iterator2.hasNext()) {
            System.out.print(" "+ iterator2.next());
        }
        System.out.println();
        while( !queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}
