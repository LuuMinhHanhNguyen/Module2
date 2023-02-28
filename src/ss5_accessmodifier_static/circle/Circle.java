package ss5_accessmodifier_static.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
}