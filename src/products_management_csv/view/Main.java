package products_management_csv.view;

import products_management_csv.controller.ProductController;


public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menuOfProducts();

    }
}
