package extra_task;

import java.util.Date;

public class Student extends Person{
    private String classes;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private int grade;

    public Student(String classes, int grade, String ID, String name, boolean gender, String dob){
        super(ID, name, dob, gender);
        this.classes = classes;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", name=" + getName() +
                ", DOB=" + getDob() +
                ", ID=" + getID() +
                ", grade=" + grade +
                ", gender=" + isGender() +
                '}';
    }
}
