package ss12_java_collection_framework.product_management.controller;

import extra_task.service.IStudentService;
import extra_task.service.implement.StudentService;
import ss12_java_collection_framework.product_management.service.IProductService;
import ss12_java_collection_framework.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService iProductService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public void menu(){
        String choice;
        do {
            System.out.println("******************************************************");
            System.out.println("WELCOME TO OUR PRODUCT MANAGEMENT SYSTEM:");
            System.out.println("Choose a number to run its function:");
            System.out.println("1. Add New Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display All Product");
            System.out.println("5. Find Product");
            System.out.println("6. Sort Products By Price");
            System.out.println("7. Exit");
            System.out.print("Choose a number here: ");
            choice = scanner.nextLine();
            if(choice.equals("1")){
                iProductService.addProduct();
            } else if (choice.equals("2")) {
                iProductService.editProduct();
            } else if (choice.equals("3")) {
                iProductService.deleteProduct();
            } else if (choice.equals("4")) {
                iProductService.displayAll();
            } else if (choice.equals("5")) {
                iProductService.findProductById();
            } else if (choice.equals("6")) {
                iProductService.sortByPrice();
            } else if (choice.equals("7")) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Please enter a valid function!");
            }
        } while (!choice.equals("7"));
    }
}
