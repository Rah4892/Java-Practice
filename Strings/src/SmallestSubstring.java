import java.util.*;

public class SmallestSubstring {
    public static void main(String[] args) {
        String input = "catismoon";
        int size = 3;
        List<String> subsets = new ArrayList<>();

        for(int i=0;(i+size)<=input.length();i++) {
            String compute = input.substring(i,(i+size));
            subsets.add(compute);
        }
        Collections.sort(subsets);
        System.out.println(subsets.get(0));
        System.out.println(subsets.get(subsets.size()-1));

    }
}
