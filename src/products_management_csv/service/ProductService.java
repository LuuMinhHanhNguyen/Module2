package products_management_csv.service;

import products_management_csv.model.Product;
import products_management_csv.repository.IProductRepository;
import products_management_csv.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final IProductRepository iProductRepository = new ProductRepository();
    private static final Scanner scanner = new Scanner(System.in);

    public void displayAllProducts(){
        List<Product> products = iProductRepository.getAllProducts();
        for (Product product: products) {
            System.out.println(product);
        }
    }
    @Override
    public void addProducts(){
        System.out.println("Enter your product's ID here:");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your product's name here:");
        String name = scanner.nextLine();
        System.out.println("Enter your product's price here:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter producer's name here:");
        String producer = scanner.nextLine();
        System.out.println("Enter your product's description here:");
        String description = scanner.nextLine();
        Product newProduct = new Product(ID, name, price, producer, description);

        iProductRepository.addProducts(newProduct);
        List<Product> products = iProductRepository.getAllProducts();
        System.out.println("There are/is " + products.size() + " product(s) in file.");
    }
    @Override
    public void findProductByName() {
        System.out.println("Please enter product's name to find:");
        String productName = scanner.nextLine();
        List<Product> suggestedProducts = iProductRepository.findProductByName(productName);
        if (suggestedProducts.isEmpty()){
            System.out.println("There is no product matching your searching!");
        } else {
            System.out.println(suggestedProducts);
        }
    }

}
