package case_study.services;

import case_study.models.*;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;
import case_study.utils.WriteFileCustomers;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    List<Customer> customers = iCustomerRepository.getAll();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Customer newCustomer = getInfoAndReturnACustomer();
        customers.add(newCustomer);
        iCustomerRepository.add(customers);
        System.out.println("Customer added!");
    }

    @Override
    public void display() {
        if (customers.size() == 0) System.out.println("There is no customer in the system! Please add some!");
        else {
            System.out.println("List of Customers:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void edit() {
        int index;
        Customer editedCustomer;
        Customer temp;
        System.out.println("Please enter customer number here to edit:");
        int customerNumber = Integer.parseInt(scanner.nextLine());
        if(iCustomerRepository.edit(customerNumber) == -1){
            System.out.println("There is no customer matching that ID!");
        } else {
            index = iCustomerRepository.edit(customerNumber);
            editedCustomer = customers.get(index);
            System.out.println("Customer Info: " + editedCustomer);
            temp = getInfoAndReturnACustomer();
            editedCustomer = temp;
            customers.set(index, editedCustomer);
            WriteFileCustomers.write(customers);
            System.out.println("Customer added!");
        }
    }

    private Customer getInfoAndReturnACustomer() {

        System.out.println("Enter customer's ID here:");
        int ID = Integer.parseInt(scanner.nextLine());


        System.out.println("Enter customer's name here:");
        String name = scanner.nextLine();

        System.out.println("Enter customer's DOB here:");
        String DOB = scanner.nextLine();

        System.out.println("Enter customer's gender here: \n" +
                "1 - MALE \n" +
                "2 - FEMALE \n" +
                "3 or Other - Other Gender");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("1")) gender = true;
        else if (tempGender.equals("2")) gender = false;
        else gender = null;

        System.out.println("Enter customer's phone number here:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter customer's email here:");
        String email = scanner.nextLine();

        System.out.println("Enter customer number here:");
        int customerID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter customer's address here:");
        String address = scanner.nextLine();

        System.out.println("Enter customer's type here: \n" +
                "1 - DIAMOND,\n" +
                "2 - PLATINUM,\n" +
                "3 - GOLD,\n" +
                "4 - SILVER,\n" +
                "5 or Other - MEMBER");
        CustomerType customerType;
        String tempCustomerType = scanner.nextLine();
        if (tempCustomerType.equals("1")) customerType = CustomerType.DIAMOND;
        else if (tempCustomerType.equals("2")) customerType = CustomerType.PLATINUM;
        else if (tempCustomerType.equals("3")) customerType = CustomerType.GOLD;
        else if (tempCustomerType.equals("4")) customerType = CustomerType.SILVER;
        else customerType = CustomerType.MEMBER;

        Customer customer = new Customer(ID, name, DOB, gender, phoneNumber, email, customerID, address, customerType);
        return customer;
    }
}
