package ss11_stack_queue.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        checkPalindrome(string);
    }
    static void checkPalindrome(String string) {
        Stack<Character> stackChar = new Stack<>();
        Queue<Character> queueChar = new LinkedList<>();

        for (Character character : string.toLowerCase().toCharArray()) {
            stackChar.push(character);
            queueChar.offer(character);
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

    }
}
