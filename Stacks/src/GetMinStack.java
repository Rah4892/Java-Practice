import java.util.Stack;

public class GetMinStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(2);

        int minValue = 999;
        while(!stack.isEmpty()) {
            int popEl = (int) stack.pop();
            if (popEl< minValue) {
                minValue = popEl;
            }
        }
    System.out.println("min element:"+ minValue);
    }
}
