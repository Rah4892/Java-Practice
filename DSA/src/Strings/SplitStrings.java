package Strings;

public class SplitStrings {
    public static void main(String[] args) {
        String input = "My2Interest4Is8Driving";
        String[] result = input.split("\\d");
        for(String str:result) {
            System.out.println(str);
        }
    }
}
