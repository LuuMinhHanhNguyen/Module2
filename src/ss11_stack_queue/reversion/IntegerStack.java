package ss11_stack_queue.reversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(14,11,1994,6,12,3));
        System.out.println(array.size());
        Stack<Integer> integerStack = new Stack<>();

        for (int element: array) {
            integerStack.push(element);
        }
        System.out.println(integerStack);

        for (int i = 0; i < array.size(); i++) {
            array.set(i, integerStack.pop());
            // we use 'set' here because
        }

        System.out.println(array);
    }
}
