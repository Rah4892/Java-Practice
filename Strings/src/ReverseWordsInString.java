import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "This is a test";
        System.out.println(str);

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
