package ss7_abstract_and_interface.practice;

import ss7_abstract_and_interface.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "A Circle with radius =" + getRadius() + ", which is a subclass of " + super.toString();
    }


    @Override
    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }
}
