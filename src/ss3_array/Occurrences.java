package ss3_array;

public class Occurrences {
    public static void main(String[] args) {
        String string = "occurrences";
        char character = 'c';
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) count++;
        }

        System.out.println(count);
    }
}
