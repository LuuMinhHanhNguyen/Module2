package products_management_csv.repository;

import products_management_csv.common.ReadFile;
import products_management_csv.common.WriteFile;
import products_management_csv.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> getAllProducts(){
        return ReadFile.read();
    }

    @Override
    public void addProducts(Product product) {
        WriteFile.write(product);
    }

    @Override
    public List<Product> findProductByName(String name) {
        List<Product> products = ReadFile.read();
        List<Product> suggestedProducts = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().contains(name)){
                suggestedProducts.add(products.get(i));
            }
        }
        return suggestedProducts;
    }
}
