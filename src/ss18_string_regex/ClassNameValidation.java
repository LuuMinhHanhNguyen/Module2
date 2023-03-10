package ss18_string_regex;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidation {
    public static void main(String[] args) {
        System.out.println("Enter your class name here: (C1222G)");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();

        System.out.println(validateClassName(className));
    }
    public static boolean validateClassName(String className){
        Pattern pattern = Pattern.compile("^[C|P|A][0-9]{4}[G|H|I|K]");
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
