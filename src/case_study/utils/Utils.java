package case_study.utils;

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

    public static boolean validateServiceName(String serviceName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }
}
