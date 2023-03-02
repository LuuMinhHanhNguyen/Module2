package ss11_stack_queue.check_bracket;

import java.util.Stack;


public class CheckBracket {
    public static void main(String[] args) {
        String string = "s * ((s – a) * (s – b) * (s – c))";
        System.out.println(checkBracket(string));

    }

    public static Boolean checkBracket(String string) {
        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bracketStack.add(string.charAt(i));
            }
            if (string.charAt(i) == ')') {
                if (bracketStack.size() > 0) {
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
}

