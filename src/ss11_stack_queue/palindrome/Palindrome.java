package ss11_stack_queue.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String hi = " minh  hnim ";
        checkPalindrome(hi);
    }
    static void checkPalindrome(String string) {
        if (string.length() % 2 == 0) {
            // nua sau la stack
            Stack<Character> stackChar = new Stack<>();
            // nua dau la Queue
            Queue<Character> queueChar = new LinkedList<>();
            int check = string.length() / 2;

            for (int i = 0; i < string.length(); i++) {
                if (i < check) stackChar.push(string.charAt(i));
                else queueChar.add(string.charAt(i));
            }
            System.out.println("Stack:" + stackChar);
            System.out.println("Queue: " + queueChar);
            boolean flag = true;

            for (int i = 0; i < stackChar.size(); i++) {
                if (stackChar.pop() != queueChar.poll()) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("This is a palindrome string!");
            else System.out.println("This is NOT a palindrome string!");
        } else System.out.println("This is NOT a palindrome string!");
    }

}
