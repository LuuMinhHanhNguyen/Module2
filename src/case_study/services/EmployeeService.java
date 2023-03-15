package case_study.services;

import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;
import case_study.utils.Utils;
import case_study.utils.WriteFileEmployees;
import case_study.models.EducationBackground;
import case_study.models.Employee;
import case_study.models.Title;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/case_study/data/employee.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    private static List<Employee> employees = iEmployeeRepository.getAll();

    public void add() {
        Employee newEmployee = getInfoAndReturnAnEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == newEmployee.getID() || employees.get(i).getEmployeeID() == newEmployee.getEmployeeID()) {
                System.out.println("You cannot use this ID / employee number because it already exists in the system!");
                return;
            }
        }
        employees.add(newEmployee);
        iEmployeeRepository.add(employees);
        System.out.println("Employee added!");
    }

    @Override
    public void display() {
        if (employees.isEmpty()) System.out.println("There is no employee in the system! Please add some!");
        else {
            System.out.println("List of Employees");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public void edit() {
        Employee editedEmployee;
        Employee temp;
        int index;
        int employeeNum;

        System.out.println("Enter employee number here to edit");
        employeeNum = Integer.parseInt(scanner.nextLine());

        if (iEmployeeRepository.edit(employeeNum) == -1) {
            System.out.println("Can not find any employee with that ID!");
        } else {
            index = iEmployeeRepository.edit(employeeNum);
            editedEmployee = employees.get(index);
            System.out.println("Employee Information: " + editedEmployee.toString());
            temp = getInfoAndReturnAnEmployee();
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getID() == temp.getID() || employees.get(i).getEmployeeID() == temp.getEmployeeID()) {
                    System.out.println("You cannot use this ID / employee number because it already exists in the system!");
                    return;
                }
            }
            editedEmployee = temp;
            employees.set(index, editedEmployee);
            WriteFileEmployees.write(employees);
            System.out.println("Employee edited!");
        }
    }


    private Employee getInfoAndReturnAnEmployee() {
        System.out.println("Enter employee's ID here:");
        int ID = Integer.parseInt(scanner.nextLine());


        System.out.println("Enter employee's name here:");
        String name = scanner.nextLine();


        // LocalTime - DOB
        LocalDate now = LocalDate.now();
        System.out.println("Enter customer's DOB here:");
        String DOB = scanner.nextLine();
        while (Utils.parseStringToLocalDate(DOB) == null
                || Period.between(Utils.parseStringToLocalDate(DOB), now).getYears() < 18
                || Period.between(Utils.parseStringToLocalDate(DOB), now).getYears() > 100) {
            System.out.println("Age should be from 18 to 100!");
            DOB = scanner.nextLine();
        }
        LocalDate finalDOB = Utils.parseStringToLocalDate(DOB);


        System.out.println("Enter employee's gender here: \n" +
                "1 - MALE \n" +
                "2 - FEMALE \n" +
                "3 or Other - Other Gender");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("1")) gender = true;
        else if (tempGender.equals("2")) gender = false;
        else gender = null;

        System.out.println("Enter employee's phone number here:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter employee's email here:");
        String email = scanner.nextLine();

        System.out.println("Enter employee number here:");
        int employeeID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter employee's education background here: \n" +
                "1 - INTERMEDIATE,\n" +
                "2 - COLLEGE,\n" +
                "3 - UNIVERSITY,\n" +
                "4 or Other - POSTGRADUATE");
        EducationBackground educationBackground;
        String tempEduBackground = scanner.nextLine();
        if (tempEduBackground.equals("1")) educationBackground = EducationBackground.INTERMEDIATE;
        else if (tempEduBackground.equals("2")) educationBackground = EducationBackground.COLLEGE;
        else if (tempEduBackground.equals("3")) educationBackground = EducationBackground.UNIVERSITY;
        else educationBackground = EducationBackground.POSTGRADUATE;

        System.out.println("Enter employee's title here: \n" +
                "1 - RECEPTIONIST,\n" +
                "2 - WAITER,\n" +
                "3 - HR,\n" +
                "4 - SUPERVISOR,\n" +
                "5 - MANAGER,\n" +
                "6 or Other - DIRECTOR");
        Title title;
        String tempTitle = scanner.nextLine();
        if (tempTitle.equals("1")) title = Title.RECEPTIONIST;
        else if (tempTitle.equals("2")) title = Title.WAITER;
        else if (tempTitle.equals("3")) title = Title.HR;
        else if (tempTitle.equals("4")) title = Title.SUPERVISOR;
        else if (tempTitle.equals("5")) title = Title.MANAGER;
        else title = Title.DIRECTOR;

        System.out.println("Enter employee's salary here:");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(ID, name, finalDOB, gender, phoneNumber, email, employeeID, educationBackground, title, salary);
        return employee;
    }


}
