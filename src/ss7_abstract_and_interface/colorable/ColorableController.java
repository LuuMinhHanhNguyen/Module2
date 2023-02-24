package ss7_abstract_and_interface.colorable;

import ss7_abstract_and_interface.practice.Circle;
import ss7_abstract_and_interface.practice.Rectangle;
import ss7_abstract_and_interface.practice.Shape;
import ss7_abstract_and_interface.practice.Square;

public class ColorableController {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);

        Rectangle rectangle1 = new Rectangle(2.0, 3.0);

        Square square1 = new Square(3);
        Square square2 = new Square(4);

        Shape[] shapes = new Shape[]{square2, circle1, rectangle1, square1};

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println("Area of square is " + shape.getArea());
                ((Colorable) shape).howToColor();
            } else {
                System.out.println("Area of" + (shape instanceof Rectangle ? " Rectangle is " : " Circle is ") + shape.getArea());
            }
        }
    }
}
