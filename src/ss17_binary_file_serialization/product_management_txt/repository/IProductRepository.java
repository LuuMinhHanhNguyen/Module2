package ss17_binary_file_serialization.product_management_txt.repository;

import ss17_binary_file_serialization.product_management_txt.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllProducts();
    void addProducts(String path, List<Product> products);

    List<Product> findProductByName(String name);

}
