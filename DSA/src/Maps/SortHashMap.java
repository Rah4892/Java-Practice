package Maps;

import java.util.*;
import java.util.LinkedList;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Ram");
        map.put(2, "Noida");
        map.put(3, "Singapore");
        System.out.println("Original map-"+map);
        Map<Integer, String> sortedMap = sortByValues(map);
        System.out.println("Sorted map -"+sortedMap);
    }

    private static Map<Integer, String> sortByValues(HashMap<Integer, String> map) {
        //get the list of elements
        List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
        System.out.println("Entry set - list="+list);
        //Sort the list
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        //put the sorted list back to hashmap
        HashMap<Integer, String> tempMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        return tempMap;
    }

}
