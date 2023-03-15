package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Utils {
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
            System.out.println("Please fix your format as dd-MM-yyyy");
        }
        return result;
    }
}
