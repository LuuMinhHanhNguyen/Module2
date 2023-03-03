package ss13_searching_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class MaximumConsecutiveIncreasingly {
    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        String string = "abccbcegikabcdefghiklmno";

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));

            for (int j = 1 + i; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println(max);
    }
}

