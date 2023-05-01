import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class UglyNumberUsingSet {
    public static void main(String[] args) {
        int n = 5;
        findNthUgly(n);
    }

    static void findNthUgly(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);

        int count =1;
        while (count < n) {
            int temp = set.pollFirst();
            set.add(temp*2);
            set.add(temp*3);
            set.add(temp*5);
            count++;
        }
        System.out.println(set.pollFirst());
    }
}
