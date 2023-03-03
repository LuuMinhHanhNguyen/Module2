package ss13_searching_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumSubsequence {
    public static void main(String[] args) {
        String string = "abchanh";
        LinkedList<Character> list = new LinkedList<>();
        Queue<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println(max);
    }
}
