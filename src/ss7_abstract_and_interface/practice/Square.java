package ss7_abstract_and_interface.practice;

import ss7_abstract_and_interface.colorable.Colorable;
import ss7_abstract_and_interface.resizeable.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "perimeter=" + getPerimeter() +
                "area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides of Square!");
    }
}
