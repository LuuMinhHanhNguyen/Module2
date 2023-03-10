package ss17_binary_file_serialization.product_management_csv.repository;

import ss17_binary_file_serialization.product_management_txt.common.ReadFile;
import ss17_binary_file_serialization.product_management_txt.common.WriteFile;
import ss17_binary_file_serialization.product_management_txt.model.Product;
import ss17_binary_file_serialization.product_management_txt.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
 public static final String PATH = "src/ss17_binary_file_serialization/product_management_txt/data/ProductManagement.txt";

    @Override
    public List<Product> getAllProducts(){
        return ReadFile.read(PATH);
    }

    @Override
    public void addProducts(String path, List<Product> products) {
        WriteFile.write(path, products);
    }

    @Override
    public List<Product> findProductByName(String name) {
        List<Product> products = ReadFile.read(PATH);
        List<Product> suggestedProducts = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().contains(name)){
                suggestedProducts.add(products.get(i));
            }
        }
        return suggestedProducts;
    }
}
