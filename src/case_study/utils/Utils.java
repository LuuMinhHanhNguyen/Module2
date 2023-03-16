package case_study.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean validateServiceID(String serviceType, String type) {

        //   Pattern pattern = Pattern.compile("^(SV)(VL|HO|RO)-\\d{4}$");
        String regex = "";

        if (type.equals("HO")) regex = "^(SVHO)-\\d{4}$";
        else if (type.equals("VL")) regex = "^(SVVL)-\\d{4}$";
        else regex = "^(SVRO)-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(serviceType);
        return matcher.matches();
    }

    public static boolean validateName(String serviceName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNum){
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
    }

    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^\\w+@\\w+.com$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static String parseLocalDateToString(LocalDate date){


        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return simpleDateFormat.format(date);
    }

    public static LocalDate parseStringToLocalDate(String dateInString){
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate result = null;
        try{
            result =  LocalDate.parse(dateInString, simpleDateFormat);
        } catch (DateTimeParseException e){
            // check format of LocalDate but cannot check valid range for dd // MM
            System.out.println("Please fix your DOB format as follows: dd-MM-yyyy (11-01-1990)");
        }
        return result;
    }
}
