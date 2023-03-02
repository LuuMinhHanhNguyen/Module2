package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.product_management.model.Product;

import java.util.LinkedList;
import java.util.List;

public interface IProductRepository {
    List<Product> displayAll();

    void addProduct(Product newProduct);
    void findProductByName(String productName);

    void deleteProduct(int ID);

    void editProduct(int ID);

    void sortByPrice(boolean option);

}
