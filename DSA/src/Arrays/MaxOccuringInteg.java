package Arrays;

import java.util.Collections;
import java.util.HashMap;

public class MaxOccuringInteg {
    public static void main(String[] args) {
        int[] input = {2,3,2,4,2,6,1,7,1,9};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: input) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            }
            else {
                map.put(i, map.get(i)+1);
            }
        }
        System.out.println(map);
        Integer key = Collections.max(map.entrySet(), HashMap.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }
}
