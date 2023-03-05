package extra_task.repository;

import extra_task.model.Student;
import extra_task.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAllTeachers();

    void addTeacher(Teacher teacher);

    void deleteTeacher(int id);
    List<Teacher> searchByName(String teacherName);
}
