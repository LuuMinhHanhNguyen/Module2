package extra_task.service.implement;

import extra_task.model.Student;
import extra_task.repository.IStudentRepository;
import extra_task.repository.implement.StudentRepository;
import extra_task.service.IStudentService;


import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void displayAllStudents() {
        List<Student> studentList = iStudentRepository.getAllStudents();
        if (studentList.isEmpty()) {
            System.out.println("There is no student in this system!");
        } else {
            for (Student student : studentList) {
                System.out.print("List of Students: ");
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void addStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name:");
        String name = sc.nextLine();
        System.out.println("Enter student's ID:");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student's class:");
        String classes = sc.nextLine();
        System.out.println("Enter student's gender: (1 =  Male, 2 = Female, 3 = Other gender)");
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
        System.out.println("Enter student's grade:");
        double grade = Integer.parseInt(sc.nextLine());

        Student newStudent = new Student(classes, grade, ID, name, gender, dob);
        iStudentRepository.addStudent(newStudent);
        System.out.println("Student added!");

    }

    @Override
    public void deleteStudent() {
        int id;
        System.out.println("Enter student's ID to delete:");
        Scanner sc = new Scanner(System.in);
        id = Integer.parseInt(sc.nextLine());
        iStudentRepository.deleteStudent(id);
    }
}
