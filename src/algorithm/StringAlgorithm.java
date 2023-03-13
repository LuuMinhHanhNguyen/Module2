package algorithm;

import java.util.ArrayList;
import java.util.List;

public class StringAlgorithm {
    public static void main(String[] args) {
        System.out.println(solution("CodegymDaNang"));

    }
    public static String solution(String s) {
        String[] strings = s.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(strings[i].toUpperCase())) {
                result.add(" ");
                result.add(strings[i].toLowerCase());

            } else result.add(strings[i]);
        }

        System.out.println(result);
        String finalString = "";

        for (int i = 0; i < result.size(); i++) {
            finalString += result.get(i).toLowerCase();
        }

        return finalString.trim();

    }
}
