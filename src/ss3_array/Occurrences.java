package ss3_array;

public class Occurrences {
    public static void main(String[] args) {
        String string = "occurrences";
        char character = 'c';
        System.out.println(occurrences(string, character));

    }
    public static int occurrences(String string, char character){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) count++;
        }
        return count;
    }
}
