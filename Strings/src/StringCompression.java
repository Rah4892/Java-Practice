//Compress a string - aabbccc -> a2b2c3 if compressed string is bigger then return original string

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abbcccaaa");
        StringBuffer result = compressString(str);
        System.out.println("Result = "+result);
    }

    private static StringBuffer compressString(StringBuffer input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        StringBuffer result = new StringBuffer();
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }
        return result;
    }

}
