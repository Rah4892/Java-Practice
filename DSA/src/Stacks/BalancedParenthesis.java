package Stacks;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String expression = "{[)(]}";
        boolean result = checkValidParenthesis(expression);
        if ((result == true)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
    public static boolean checkValidParenthesis(String expression) {
        Stack<Character> stack = new Stack<>();
        char c;
        for(int i =0;i<expression.length();i++) {
            c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (stack.isEmpty())
                System.out.println("Invalid");
            char popped;
            switch (c) {
                case ')':
                    popped = stack.pop();
                    if (popped != '(')
                        return false;
                    break;
                case '}':
                    popped = stack.pop();
                    if (popped != '{')
                        return false;
                    break;
                case ']':
                    popped = stack.pop();
                    if (popped != '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
