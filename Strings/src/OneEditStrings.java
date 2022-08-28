import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class OneEditStrings {
    public static void main(String[] args) {
        String str1 = "moo";
        String str2 = "oon";
        String str3 = "mon";
        String str4 = "mabn";
        String str5 = "Tulk";
        String target = "moon";
        String target2 = "Tilak";

        System.out.println(isOneEditAway(str1, target));
        System.out.println(isOneEditAway(str2, target));
        System.out.println(isOneEditAway(str3, target));
        System.out.println(isOneEditAway(str4, target));
    }

    public static boolean isOneEditAway(String input, String target) {
        //Approach 1
        // if the input string is substring of n-1 size of the target string then return true
        //else return false

        //create n-1 size substring of the target string and store it as a list
        List<String> substrings = new ArrayList<>();
        int size = target.length() - 1;
        for(int i=0;(i+size)<=input.length();i++) {
            String compute = input.substring(i,(i+size));
            substrings.add(compute);
        }
        return substrings.contains(input) ? true : false;
    }

}
