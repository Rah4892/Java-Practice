import java.util.ArrayList;
import java.util.List;

public class PrintSubstring {

    public static void printSubstr(String input, String output) {
        if(input.length() == 0) {
            System.out.println("Substring = "+output);
            return;
        }
        printSubstr(input.substring(1), output+input.charAt(0));

        printSubstr(input.substring(1), output);
    }
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        printSubstr(input, output);
    }
}
