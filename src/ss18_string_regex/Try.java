package ss18_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try {
    public static void main(String[] args) {
        final String REGEX_EMAIL = "";
        System.out.println(validate("^\\w+@\\w+.com$", "hanh@yahoo.com"));
    }

    public static boolean validate(String regex, String check) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
