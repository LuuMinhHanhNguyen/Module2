package ss6_inheritance.practice;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }


    @Override
    public String toString() {
        return "A Circle with radius =" + getRadius() + ", which is a subclass of " + super.toString();
    }


}
