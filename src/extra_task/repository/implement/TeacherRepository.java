package extra_task.repository.implement;

import extra_task.model.Teacher;
import extra_task.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teacherList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getID() == id) {
                System.out.println("Are you sure to delete this teacher? - (Yes/No)");
                String cf = scanner.nextLine();
                if (cf.equals("Yes")) {
                    teacherList.remove(teacherList.get(i));
                    System.out.println("Teacher deleted!");
                    break;
                }
            } else System.out.println("Cannot find your teacher's ID!");
        }

    }
}
