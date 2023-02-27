package extra_task;

import java.util.Date;

public abstract class Person {
    private String ID;
    private String name;
    private String dob;
    private boolean gender;

    public Person(){

    }

    public Person(String ID, String name, String dob, boolean gender) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }





}
