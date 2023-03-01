package extra_task.service.implement;

import extra_task.model.Teacher;
import extra_task.repository.ITeacherRepository;
import extra_task.repository.implement.TeacherRepository;
import extra_task.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public void displayAllTeachers() {
        List<Teacher> teacherList = iTeacherRepository.getAllTeachers();
        if (teacherList.isEmpty()) {
            System.out.println("There is no teacher in this system!");
        } else {
            for (Teacher teacher : teacherList) {
                System.out.print("List of Teachers: ");
                System.out.println(teacher.toString());
            }
        }
    }

    @Override
    public void addTeacher() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teacher's name:");
        String name = sc.nextLine();
        System.out.println("Enter teacher's ID:");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter teacher's gender: (1 =  Male, 2 = Female, 3 = Other gender)");
        Boolean gender;
        int tempGender = Integer.parseInt(sc.nextLine());
        if (tempGender == 1) {
            gender = true;
        } else if (tempGender == 2) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Enter student's birthday:");
        String dob = sc.nextLine();
        System.out.println("Enter teacher's teaching subject:");
        String teachingSubject = sc.nextLine();
        Teacher newTeacher = new Teacher(ID, name, dob, gender, teachingSubject);
        iTeacherRepository.addTeacher(newTeacher);
        System.out.println("Teacher added!");

    }

    @Override
    public void deleteTeacher() {
        int id;
        System.out.println("Enter teacher's ID to delete:");
        Scanner sc = new Scanner(System.in);
        id = Integer.parseInt(sc.nextLine());
        iTeacherRepository.deleteTeacher(id);
    }
}
