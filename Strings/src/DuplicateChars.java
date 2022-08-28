import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "TESTING TIMES";
        StringBuffer dupChar = new StringBuffer();

        Set hashSet = new HashSet();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (!hashSet.contains(c)) {
                hashSet.add(c);
            }
            else {
                dupChar.append(c);
            }
        }
        System.out.println(hashSet);
        System.out.println(dupChar);
    }
}
