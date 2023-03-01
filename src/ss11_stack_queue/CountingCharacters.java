package ss11_stack_queue;

import java.util.TreeMap;

public class CountingCharacters {
    public static void main(String[] args) {
        TreeMap<Character, Integer> result = new TreeMap<Character, Integer>();
        String name = "Nguyen Luu Minh Hanh";
        for (char character: name.toLowerCase().toCharArray()) {
            if(result.containsKey(character)){
                int count = result.get(character);
                result.put(character, count+1);
            } else {
                result.put(character, 1);
            }
        }

        System.out.println(result);
    }


}
