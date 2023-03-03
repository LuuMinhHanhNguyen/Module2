package ss12_java_collection_framework.product_management.service;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.IProductRepository;
import ss12_java_collection_framework.product_management.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    IProductRepository iProductRepository = new ProductRepository();
    List<Product> products = iProductRepository.displayAll();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void displayAll() {
        if(iProductRepository.displayAll().isEmpty()) {
            System.out.println("There is no product in this system!");
        } else {
            System.out.println("Your Product List:");
            System.out.println(iProductRepository.displayAll());
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Enter product's ID:");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product's name:");
        String name = scanner.nextLine();
        System.out.println("Enter product's price:");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(ID, name, price);
        iProductRepository.addProduct(newProduct);
        System.out.println("Product added!");
    }

    @Override
    public void findProductById() {
        System.out.println("Search product by name:");
        String productName = scanner.nextLine();
        iProductRepository.findProductByName(productName);
    }

    @Override
    public void deleteProduct() {
        System.out.println("To delete a product, please enter product's ID here:");
        int ID = Integer.parseInt(scanner.nextLine());
        iProductRepository.deleteProduct(ID);
    }

    @Override
    public void editProduct() {
        System.out.println("To edit a product, please enter product's ID here:");
        int ID = Integer.parseInt(scanner.nextLine());
        iProductRepository.editProduct(ID);
    }

    @Override
    public void sortByPrice() {
       String option;
        do{
            System.out.println("How do you want to sort your product's list:");
            System.out.println("1. In ascending order ->");
            System.out.println("2. In descending order <-");
             option = scanner.nextLine();
            if(option.equals("1")) {
                iProductRepository.sortByPrice(true);
                return;
            } else if (option.equals("2")) {
                iProductRepository.sortByPrice(false);
                return;
            } else {
                System.out.println("Please choose your desired order!");
            }
        } while (true);

    }
}
