
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

public class Anagrams {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";

        Hashtable<Character, Integer> table1 = new Hashtable<>();
        Hashtable<Character, Integer> table2 = new Hashtable<>();

        for(int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            if (table1.containsKey(c)) {
                table1.put(c, table1.get(c)+1);
            }
            else {
                table1.put(c, 1);
            }
        }

        for(int i=0;i<b.length();i++) {
            char c = b.charAt(i);

            if (table2.containsKey(c)) {
                table2.put(c, table2.get(c)+1);
            }
            else {
                table2.put(c, 1);
            }
        }

        Enumeration<Character> e = table1.keys();
        System.out.println(table1);
        System.out.println(table2);
        if (table1.equals(table2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
