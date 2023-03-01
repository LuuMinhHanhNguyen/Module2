package extra_task.controller;

import extra_task.service.IStudentService;
import extra_task.service.implement.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        String input;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==========================================================");
            System.out.println("--STUDENT MANAGEMENT--");
            System.out.println("Choose a number to run its function");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete a student");
            System.out.println("3. Display student's list");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    iStudentService.addStudent();
                    break;
                case "2":
                    iStudentService.deleteStudent();
                    break;
                case "3":
                    iStudentService.displayAllStudents();
                    break;
                case "4":
                    System.out.println("Thank you!");
                    break;
            }

        } while (!input.equals("4"));
    }
}

