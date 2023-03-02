package ss11_stack_queue.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to change into binary:");
        int input = Integer.parseInt(sc.nextLine());
        int remainder;

        while (input != 0) {
            remainder = input % 2;
            input /= 2;
            integerStack.push(remainder);
        }
        System.out.println("Stack:" + integerStack);
        int arrLength = integerStack.size();

        for (int i = 0; i < arrLength; i++) {
            result.add(integerStack.pop());
        }
        System.out.println("Binary: "+ result);


    }


}
