package extra_task.controller;

import extra_task.service.ITeacherService;
import extra_task.service.implement.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        String input;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==========================================================");
            System.out.println("--TEACHER MANAGEMENT--");
            System.out.println("Choose a number to run its function");
            System.out.println("1. Add a new teacher");
            System.out.println("2. Delete a teacher");
            System.out.println("3. Display teacher's list");
            System.out.println("4. Find Teachers");
            System.out.println("5. Exit");
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    iTeacherService.addTeacher();
                    break;
                case "2":
                    iTeacherService.deleteTeacher();
                    break;
                case "3":
                    iTeacherService.displayAllTeachers();
                    break;
                case "4":
                    iTeacherService.searchByName();
                    break;
                case "5":
                    System.out.println("Thank you!");
                    break;
            }

        } while (!input.equals("5"));
    }

}
