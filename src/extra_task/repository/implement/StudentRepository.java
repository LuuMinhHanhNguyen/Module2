package extra_task.repository.implement;

import extra_task.model.Student;
import extra_task.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == id) {
                System.out.println("Are you sure to delete this student? - (Yes/No)");
                String cf = scanner.nextLine();
                if (cf.equals("Yes")) {
                    studentList.remove(studentList.get(i));
                    System.out.println("Student deleted!");
                    return;
                    // use 'return' to end the function
                }
            }
        }
        // remember not to use if - else in loop .. consider this case to know more abt it
        System.out.println("Cannot find your student's ID!");
    }
}
