package case_study.repository;

import case_study.models.Employee;
import case_study.utils.ReadFileEmployees;
import case_study.utils.WriteFileEmployees;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{

    private static List<Employee> employees = ReadFileEmployees.read();
    @Override
    public List<Employee> getAll() {
        return ReadFileEmployees.read();
    }

    @Override
    public void add(List<Employee> employees) {
        WriteFileEmployees.write(employees);
    }

    @Override
    public int edit(int employeeID) {
        for (int i = 0; i < employees.size(); i++) {
            if(employeeID == employees.get(i).getEmployeeID()){
                return i;
            }
        }
        return -1;
    }


//    @Override
//    public void edit() {
//        Employee editedEmployee = new Employee();
//        Employee temp;
//        int index = 0;
//        System.out.println("Enter employee number here to edit");
//        int employeeNum = Integer.parseInt(scanner.nextLine());
//        boolean flag = false;
//        for (int i = 0; i < employees.size(); i++) {
//            if(employeeNum == employees.get(i).getEmployeeID()){
//                editedEmployee = employees.get(i);
//                index = i;
//                System.out.println("index:" + i);
//                flag = true;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("Employee Information: " + editedEmployee.toString());
//            temp = getInfoAndReturnAnEmployee();
//            editedEmployee = temp;
//            employees.set(index, editedEmployee);
//            WriteFileEmployees.write(employees);
//        }
//        else System.out.println("Can not find any employee with that ID!");
//    }
}
