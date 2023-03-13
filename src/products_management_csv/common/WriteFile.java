package products_management_csv.common;

import products_management_csv.model.Product;

import java.io.*;

public class WriteFile {
    public static final String PATH = "src/products_management_csv/data/ProductManagement.csv";

    public static void write(Product product) {

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(PATH, true));
            bufferedWriter.write(product.writeToCSV());
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
