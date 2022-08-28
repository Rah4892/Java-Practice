import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MaxOccurChar {
    public static void main(String[] args) {
        String str = "baabdcabaacaa";

        //HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

        int maxValue = (Collections.max(map.values()));

        for (Map.Entry entry: map.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                System.out.println("result="+ entry.getKey());
                break;
            }
        }

    }
}
