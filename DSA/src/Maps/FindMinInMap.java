package Maps;

import java.util.Collections;
import java.util.HashMap;

public class FindMinInMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2000);
        map.put(2, 800);
        map.put(3, 1200);
        Integer min = Collections.min(map.keySet());
        System.out.println("Min key="+min);

        Integer max = Collections.max(map.values());
        System.out.println("max value="+max);
    }
}
