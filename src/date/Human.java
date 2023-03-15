package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.Date;

public class Human {
    private String name;
    private LocalDate DOB;

    public Human(String name, LocalDate DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }



    @Override
    public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", DOB=" + Utils.parseLocalDateToString(DOB) +
                    '}';
    }

    public String writeToCSV(){
        return name + "," + Utils.parseLocalDateToString(DOB);
    }
}
