package extra_task.repository;

import extra_task.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllStudents();

    void addStudent(Student student);

    void deleteStudent(int id);

     List<Student> searchByName(String studentName);

}
