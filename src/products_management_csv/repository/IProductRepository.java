package products_management_csv.repository;



import products_management_csv.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllProducts();
    void addProducts(Product product);

    List<Product> findProductByName(String name);

}
