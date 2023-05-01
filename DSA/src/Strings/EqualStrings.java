package Strings;

import java.util.HashMap;

// strings abca and baca are considered equal since the characters have same frequence
public class EqualStrings {
    public static void main(String[] args) {
        String str1 = "abcca";
        String str2 = "baca";
        System.out.println(checkEquality(str1, str2));
    }

    private static boolean checkEquality(String str1, String str2) {
        boolean result = false;
        if (str1.length() != str2.length())
           return result;
        else {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i =0;i<str1.length();i++) {
                char c = str1.charAt(i);
                if (map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }
                else {
                    map.put(c, 1);
                }
            }
            for(int i =0;i<str2.length();i++) {
                char c = str1.charAt(i);
                if(map.containsKey(c)) {
                    map.put(c, map.get(c) -1);
                }
            }
            Integer sum = 0;
            for(Integer i : map.values()) {
                sum += i;
            }
            if (sum == 0)
                result = true;
            else
                result = false;

            return result;
        }
    }
}
