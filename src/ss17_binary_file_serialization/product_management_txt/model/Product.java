package ss17_binary_file_serialization.product_management_txt.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int ID;
    private String name;
    private double price;
    private String producer;
    private String description;
    public Product(){

    }

    public Product(int ID, String name, double price, String producer, String description) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String writeToCSV(){
        return  ID + "," + name + "," + price + "," + producer + "," + description ;
    }
}
