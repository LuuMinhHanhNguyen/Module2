package ss12_java_collection_framework.product_management.view;

import ss12_java_collection_framework.product_management.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menu();

    }
}
