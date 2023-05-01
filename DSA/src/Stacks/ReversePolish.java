package Stacks;

import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) throws ArithmeticException{
        String[] expression = new String[] {"2", "1","+","3","*"};
        Stack<String> stack = new Stack();
        String operators = "+-/*";
        for(String t: expression) {
            if (!operators.contains(t)) {
                stack.push(t);
            }
            else {
                //pop two elements and apply the operator
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (t) {
                    case "+" : stack.push(String.valueOf(a+b));
                        break;
                    case "-" : stack.push(String.valueOf(a-b));
                        break;
                    case "/" : stack.push(String.valueOf(a/b));
                        break;
                    case "*" : stack.push(String.valueOf(a*b));
                        break;
                }
            }

        }
        System.out.println(stack);
    }
}
