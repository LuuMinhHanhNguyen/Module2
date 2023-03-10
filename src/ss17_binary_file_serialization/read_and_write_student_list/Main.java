package ss17_binary_file_serialization.read_and_write_student_list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(students);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            students = (List<Student>) ois.readObject();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;
    }
}

