import java.util.regex.*;

public class RegularExpression {
    public static void main(String[] args) {
        //Pattern class
        String regex = "www*gmail";
        //creating the pattern to search
        Pattern pattern = Pattern.compile("gmail");

        //searching the pattern using Matcher
        Matcher matcher = pattern.matcher("abc@gmail.gmail");

        //System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.start()+ " " + matcher.end());
            System.out.println(matcher.group());
        }

    }
}
