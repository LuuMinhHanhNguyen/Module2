package case_study.controllers;

import case_study.services.CustomerService;
import case_study.services.EmployeeService;
import case_study.services.ICustomerService;
import case_study.services.IEmployeeService;

import java.util.Scanner;

public class FurumaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static String input = "";
    private static IEmployeeService employeeService = new EmployeeService();
    private static ICustomerService customerService = new CustomerService();
    public static void main(String[] args) {

        displayMainMenu();
    }
    public static void displayMainMenu(){

        do{
            System.out.println("====================================");
            System.out.println("***** Welcome to Furuma Management System: *****");
            System.out.println("Please choose a number to run its function:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": displayEmployeeManagementMenu(); break;
                case "2": displayCustomerManagementMenu(); break;
                case "3": displayFacilityManagementMenu(); break;
                case "4": displayBookingManagementMenu(); break;
                case "5": displayPromotionManagementMenu(); break;
                case "6": System.out.println("Thank you! See you later!"); return;
            }
        } while(!input.equals("6"));
    }


    public static void displayEmployeeManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Employee Management *****");
            System.out.println("1. Display list of employees:");
            System.out.println("2. Add new employee:");
            System.out.println("3. Edit employee:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": employeeService.display(); break;
                case "2": employeeService.add(); break;
                case "3": employeeService.edit(); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayCustomerManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Customer Management *****");
            System.out.println("1. Display list of customers:");
            System.out.println("2. Add new customer:");
            System.out.println("3. Edit customer:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": customerService.display(); break;
                case "2": customerService.add(); break;
                case "3": customerService.edit(); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayFacilityManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Facility Management *****");
            System.out.println("1. Display list of facility:");
            System.out.println("2. Add new facility:");
            System.out.println("3. Display facility maintenance list:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": System.out.println("hihi"); break;
                case "2": System.out.println("hihhi"); break;
                case "3": System.out.println("hihhhi"); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayBookingManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Booking Management *****");
            System.out.println("1. Add new booking:");
            System.out.println("2. Display list of bookings:");
            System.out.println("3. Create new contract:");
            System.out.println("4. Display list of contracts:");
            System.out.println("5. Edit contract:");
            System.out.println("6. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": System.out.println("hihi"); break;
                case "2": System.out.println("hihhi"); break;
                case "3": System.out.println("hihhhi"); break;
                case "4": System.out.println("hihhhi"); break;
                case "5": System.out.println("hihhhi"); break;
                case "6":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("6"));
    }


    public static void displayPromotionManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Promotion Management *****");
            System.out.println("1. Display list of customers.csv using service:");
            System.out.println("2. Display list of customers.csv getting vouchers:");
            System.out.println("3. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": System.out.println("hihi"); break;
                case "2": System.out.println("hihhi"); break;
                case "3":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("3"));
    }


}
