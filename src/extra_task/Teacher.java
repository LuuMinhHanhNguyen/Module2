package extra_task;

import java.util.Date;

public class Teacher extends Person{
    private String subject;

    public Teacher(String ID, String name, String dob, boolean gender, String subject) {
        super(ID, name, dob, gender);
        this.subject = subject;
    }


}
