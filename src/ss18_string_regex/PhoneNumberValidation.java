package ss18_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        System.out.println("Enter your phone number here: (xx-0xxxxxxxxx)");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        System.out.println(validatePhoneNumber(phoneNumber));

    }
    public static boolean validatePhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^[0-9]{2}-0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
