package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.Student;
import ss12_java_collection_framework.product_management.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository{
    static List<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Product> displayAll() {
        return products;
    }

    @Override
    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    @Override
    public void findProductByName(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(productName)){
                System.out.println("Your searching product:" + products.get(i));
                return;
            }
        }
        System.out.println("Cannot find the product with its input name!");
    }


    @Override
    public void deleteProduct(int ID) {
        String cf;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID() == ID){
                System.out.println("Are you sure to delete this product?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                cf = scanner.nextLine();
                if(cf.equals("1")) {
                    products.remove(products.get(i));
                    System.out.println("Product deleted!");
                }
                return;
            }
        }
        System.out.println("Cannot find the product with its input ID!");
    }


    @Override
    public void editProduct(int ID) {
        String cf;
        Product editedProduct;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID() == ID){
                do {
                    editedProduct = products.get(i);
                    System.out.println("How do you want to change your product's detail:");
                    System.out.println("1.Change Product Name");
                    System.out.println("2.Change Product Price");
                    System.out.println("3. Both");
                    cf = scanner.nextLine();
                    if(cf.equals("1")) {
                        System.out.println("Please enter new name for your product:");
                        String newName = scanner.nextLine();
                        editedProduct.setName(newName);
                        return;
                    } else if (cf.equals("2")){
                        System.out.println("Please enter new price for your product:");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        editedProduct.setPrice(newPrice);
                        return;
                    } else if(cf.equals("3")){
                        System.out.println("Please enter new name for your product:");
                        String newName = scanner.nextLine();
                        System.out.println("Please enter new price for your product:");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        editedProduct.setName(newName);
                        editedProduct.setPrice(newPrice);
                        return;
                    } else {
                        System.out.println("Please enter a valid function!");
                    }
                } while (true);
            } else {
                System.out.println("Cannot find the product with its input ID!");
            }
        }


    }

    @Override
    public void sortByPrice(boolean option) {
        List<Product> tempOrder = new ArrayList<>(products);

        if(option){
            tempOrder.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice() > o2.getPrice()) return 1;
                    else if (o1.getPrice() < o2.getPrice()) return -1;
                    else return 0;
                }
            });
            System.out.println("Your Product List in Ascending Order:");
            System.out.println(tempOrder);
        } else {
            tempOrder.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice() < o2.getPrice()) return 1;
                    else if (o1.getPrice() > o2.getPrice()) return -1;
                    else return 0;
                }
            });
            System.out.println("Your Product List in Descending Order:");
            System.out.println(tempOrder);
        }
    }
}
