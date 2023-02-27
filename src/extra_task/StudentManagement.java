package extra_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StudentManagement {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        int input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--STUDENT MANAGEMENT--");
            System.out.println("Choose a number to run its function");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete a student");
            System.out.println("3. Display student's list");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    System.out.println("List of Students:");
                    System.out.println(students);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
            }

        } while (input != 4);


    }

    public static void addStudent() {
        String classes;
        int grade;
        String ID;
        String name;
        boolean gender;
        String dob;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name:");
        name = sc.nextLine();
        System.out.println("Enter student's ID:");
        ID = sc.nextLine();
        System.out.println("Enter student's class:");
        classes = sc.nextLine();
        System.out.println("Enter student's gender: (True =  Male, False = Female)");
        gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Enter student's birthday:");
        dob = sc.nextLine();
        System.out.println("Enter student's grade:");
        grade = Integer.parseInt(sc.nextLine());

        Student newStudent = new Student(classes, grade, ID, name, gender, dob);
        students.add(newStudent);
        System.out.println("Student added!");

    }

    public static void deleteStudent() {
        String id;
        System.out.println("Enter student's ID to delete:");
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID().equals(id)) {
                students.remove(students.get(i));
                System.out.println("Student deleted!");
                break;
            } else System.out.println("Cannot find your student's ID!");
        }

    }


}
