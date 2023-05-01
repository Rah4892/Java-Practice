package Strings;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mankind is great";

        //Since strings are immutable, so if we only want to display then we can push it to the stack and pop it back
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<str.length();i++) {
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        //If we want to return the result then use string buffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
