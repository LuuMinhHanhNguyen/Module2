package ss17_binary_file_serialization.product_management_txt.common;

import ss17_binary_file_serialization.product_management_txt.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<Product> read(String path) {

        List<Product> products = new ArrayList<>();
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) ois.readObject();
        } catch (EOFException e){
            WriteFile.write(path, products);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois = new ObjectInputStream(new FileInputStream(path));
                products = (List<Product>) ois.readObject();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return products;
    }

}
