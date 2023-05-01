//Given arrays for N (>= 2) users, each representing the IDs of hotels visited,
// find the common IDs of the hotels visited amongst the users.

import java.util.HashSet;

public class CommonHotel {
    public static void main(String[] args) {
        int[] userA = {2,3,1};
        int[] userB = {2,5,3};
        int[] userC = {7,3,1};

        HashSet<Integer> set1 = new HashSet<>();
        for(int i: userA) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: userB) {
            set2.add(i);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for(int i: userC) {
            set3.add(i);
        }
        set1.retainAll(set2);
        set1.retainAll(set3);
        System.out.println(set1);
    }
}
