package extra_task.model;

import extra_task.model.Person;

public class Teacher extends Person {
    private String teachingSubject;

    public Teacher(int ID, String name, String dob, Boolean gender, String subject) {
        super(ID, name, dob, gender);
        this.teachingSubject = subject;
    }

    @Override
    public String toString() {
        return "Teacher(" +
                " name = " + getName() +
                ", teachingSubject = '" + teachingSubject + '\'' +
                ", DOB = " + getDob() +
                ", ID = " + getID() +
                ", gender = " + isGender() +
                ')';
    }
}
