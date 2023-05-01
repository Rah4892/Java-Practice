package Sorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        k--;    //because the index starts from 0
        int n = arr.length;
        //approach 1 is using a TreeSet that maintains the sorting order of elements
        Set<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<arr.length;i++) {
            treeSet.add(arr[i]);
        }

        System.out.println(treeSet);

        Iterator<Integer> iterator = treeSet.iterator();

        while (k>0) {
            iterator.next();
            k--;
        }
        System.out.println(iterator.next());
    }
}
