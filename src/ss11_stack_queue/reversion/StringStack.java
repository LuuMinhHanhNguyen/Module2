package ss11_stack_queue.reversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {

        String string = "nguyen luu minh hanh";
        String[] strings = string.split(" ");
        System.out.println(strings.length);
        ArrayList<String> result = new ArrayList<String>();


        Stack<String> stringStack = new Stack<>();
        for (String element: strings) {
            stringStack.push(element);
        }

        System.out.println(stringStack);

        for (int i = 0; i < strings.length; i++) {
            result.add(stringStack.pop());
        }
        System.out.println(result);
    }
}
