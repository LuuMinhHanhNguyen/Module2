package products_management_csv.common;

import products_management_csv.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public static final String PATH = "src/products_management_csv/data/ProductManagement.csv";
    public static List<Product> read() {
        List<Product> products = new ArrayList<>();
        String line;
        BufferedReader bufferedReader = null;
        String[] temp;
        Product product;
        File file = new File(PATH);
        if (file.length() == 0) {
            System.out.println("No products in the file! Please add some!");
            return products;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    product = new Product(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]), temp[3], temp[4]);
                    products.add(product);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return products;
        }

    }
}


