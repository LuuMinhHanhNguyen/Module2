package ss17_binary_file_serialization.product_management_txt.controller;

import ss17_binary_file_serialization.product_management_txt.service.IProductService;
import ss17_binary_file_serialization.product_management_txt.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void menuOfProducts() {
        String input;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==========================================================");
            System.out.println("--PRODUCT MANAGEMENT--");
            System.out.println("Choose a number to run its function");
            System.out.println("1. Add a new product");
            System.out.println("2. Display product's list");
            System.out.println("3. Find Products");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    iProductService.addProducts();
                    break;
                case "2":
                    iProductService.displayAllProducts();
                    break;
                case "3":
                    iProductService.findProductByName();
                    break;
                case "4":
                    System.out.println("Thank you!");
                    break;
            }
        } while (!input.equals("4"));
    }
}